// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public String type;

    public static DescribeAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupRequest self = new DescribeAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAssetGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAssetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAssetGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAssetGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
