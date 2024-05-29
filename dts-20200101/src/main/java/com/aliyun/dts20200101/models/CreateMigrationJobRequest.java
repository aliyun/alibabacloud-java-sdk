// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateMigrationJobRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The specification of the data migration instance. Valid values: **small**, **medium**, **large**, **xlarge**, and **2xlarge**.</p>
     * <br>
     * <p>> </p>
     * <p>*   For more information about the test performance of each specification, see [Specifications of data migration instances](https://help.aliyun.com/document_detail/26606.html).</p>
     * <p>*   For more information about the pricing of data migration instances, see [Pricing](https://help.aliyun.com/document_detail/117780.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MigrationJobClass")
    public String migrationJobClass;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data migration instance resides. The region ID of the data migration instance is the same as that of the destination database. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region where the data migration instance resides. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationJobRequest self = new CreateMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateMigrationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMigrationJobRequest setMigrationJobClass(String migrationJobClass) {
        this.migrationJobClass = migrationJobClass;
        return this;
    }
    public String getMigrationJobClass() {
        return this.migrationJobClass;
    }

    public CreateMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateMigrationJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateMigrationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMigrationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
