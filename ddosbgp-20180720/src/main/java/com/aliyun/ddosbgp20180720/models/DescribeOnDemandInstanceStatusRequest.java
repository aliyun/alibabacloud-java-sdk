// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusRequest extends TeaModel {
    /**
     * <p>The IDs of the anti-DDoS diversion instances.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all anti-DDoS diversion instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The region ID of the anti-DDoS diversion instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all regions that are supported by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeOnDemandInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusRequest self = new DescribeOnDemandInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeOnDemandInstanceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
