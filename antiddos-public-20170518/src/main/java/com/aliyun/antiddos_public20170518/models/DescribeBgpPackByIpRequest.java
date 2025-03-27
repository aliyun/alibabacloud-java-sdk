// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpRequest extends TeaModel {
    /**
     * <p>The region ID of the asset to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/353250.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The IP address of the asset to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/472620.html">DescribeInstanceIpAddress</a> operation to query the IDs of Elastic Compute Service (ECS) instances, Server Load Balancer (SLB) instances, and elastic IP addresses (EIPs) within the current Alibaba Cloud account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>118.31.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    public static DescribeBgpPackByIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackByIpRequest self = new DescribeBgpPackByIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackByIpRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeBgpPackByIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
