// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The language of query results. Valid values:</p>
     * <br>
     * <p>*   **zh-CN** (default): Chinese.</p>
     * <p>*   **en-US**: English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The resources available in the supported modes.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The version of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAvailableResourceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAvailableResourceRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public DescribeAvailableResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailableResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailableResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
