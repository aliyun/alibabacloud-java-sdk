// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeInstanceSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsRequest self = new DescribeInstanceSpecsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceSpecsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceSpecsRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceSpecsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceSpecsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
