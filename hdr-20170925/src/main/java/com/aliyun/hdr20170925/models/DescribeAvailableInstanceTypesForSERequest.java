// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAvailableInstanceTypesForSERequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Region")
    public String region;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableInstanceTypesForSERequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableInstanceTypesForSERequest self = new DescribeAvailableInstanceTypesForSERequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableInstanceTypesForSERequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAvailableInstanceTypesForSERequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeAvailableInstanceTypesForSERequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeAvailableInstanceTypesForSERequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAvailableInstanceTypesForSERequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAvailableInstanceTypesForSERequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
