// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesRequest extends TeaModel {
    /**
     * <p>The database engine of the instance. Set the value to **MongoDB**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <br>
     * <p>*   **5.0**</p>
     * <p>*   **4.4**</p>
     * <p>*   **4.2**</p>
     * <p>*   **4.0**</p>
     * <p>*   **3.4**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role of the instance. Valid values:</p>
     * <br>
     * <p>1. db:  a shard node.</p>
     * <br>
     * <p>1. cs:  a Configserver node.</p>
     * <br>
     * <p>1. mongos:  a mongos node.</p>
     * <br>
     * <p>1. normal: a replica set node.</p>
     * <br>
     * <p>1. physical: a standalone node.</p>
     * <br>
     * <p>default: normal</p>
     */
    @NameInMap("Role")
    public String role;

    public static DescribeParameterTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesRequest self = new DescribeParameterTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParameterTemplatesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterTemplatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParameterTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParameterTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeParameterTemplatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParameterTemplatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeParameterTemplatesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
