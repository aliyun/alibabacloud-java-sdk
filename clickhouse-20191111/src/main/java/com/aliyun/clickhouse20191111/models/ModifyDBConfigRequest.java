// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBConfigRequest extends TeaModel {
    /**
     * <p>The dictionary configuration items.</p>
     * <blockquote>
     * <p>The value of the Config parameter overwrites the existing configuration. To delete a dictionary configuration, remove it from the request.</p>
     * </blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2360627.html">DescribeDBConfig</a> operation to query the dictionary configuration of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p><dictionaries><dictionary><name>test_dictionary</name><source><clickhouse><host>10.0.0.0</host><port>3003</port><user>TestUser</user><password>testPassword</password><db>default</db><table>dictTestTable01</table><where>active=1</where><invalidate_query>SELECT max(value) FROM dictTestTable01</invalidate_query></clickhouse></source><lifetime><min>200</min><max>600</max></lifetime><layout><flat></flat></layout><structure><id><name>id</name><type>UInt64</type></id><attribute><name>value</name><type>String</type><null_value></null_value></attribute></structure></dictionary></dictionaries></p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1r59y779o04****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. Call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the IDs of available regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBConfigRequest self = new ModifyDBConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyDBConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
