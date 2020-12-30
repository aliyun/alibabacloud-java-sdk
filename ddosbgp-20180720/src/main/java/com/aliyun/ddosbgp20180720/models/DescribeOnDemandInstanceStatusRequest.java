// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    public static DescribeOnDemandInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusRequest self = new DescribeOnDemandInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOnDemandInstanceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOnDemandInstanceStatusRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
