// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeOssStsRequest extends TeaModel {
    @NameInMap("ak")
    public String ak;

    @NameInMap("cloudType")
    public String cloudType;

    @NameInMap("region")
    public String region;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("sk")
    public String sk;

    @NameInMap("tenantId")
    public String tenantId;

    public static DescribeOssStsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStsRequest self = new DescribeOssStsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssStsRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeOssStsRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public DescribeOssStsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeOssStsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOssStsRequest setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

    public DescribeOssStsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
