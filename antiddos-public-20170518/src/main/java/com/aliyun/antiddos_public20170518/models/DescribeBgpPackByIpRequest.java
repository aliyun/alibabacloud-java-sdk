// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpRequest extends TeaModel {
    /**
     * <p>The region ID of the asset to query.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The IP address of the asset to query.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](https://help.aliyun.com/document_detail/354191.html) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * <br>
     * <p>This parameter is required.</p>
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
