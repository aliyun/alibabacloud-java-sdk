// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVscRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the virtual storage channel.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the device</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run and does not query the resource status. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false: sends a normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the resource status is queried.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp**c262</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVscRequestTag> tag;

    /**
     * <p>The name of the virtual storage channel.</p>
     * 
     * <strong>example:</strong>
     * <p>Device 1</p>
     */
    @NameInMap("VscName")
    public String vscName;

    /**
     * <p>The VSC type. Valid values: Primary and Standard. Default value: Primary.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("VscType")
    public String vscType;

    public static CreateVscRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVscRequest self = new CreateVscRequest();
        return TeaModel.build(map, self);
    }

    public CreateVscRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVscRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVscRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVscRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVscRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVscRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVscRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVscRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVscRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVscRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVscRequest setTag(java.util.List<CreateVscRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVscRequestTag> getTag() {
        return this.tag;
    }

    public CreateVscRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public CreateVscRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

    public static class CreateVscRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance, disk, and primary ENI created by using this template version. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVscRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVscRequestTag self = new CreateVscRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVscRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVscRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
