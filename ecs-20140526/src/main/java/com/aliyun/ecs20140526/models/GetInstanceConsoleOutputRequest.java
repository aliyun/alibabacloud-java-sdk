// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to remove formatting symbols from the returned command output. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("RemoveSymbols")
    public Boolean removeSymbols;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetInstanceConsoleOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputRequest self = new GetInstanceConsoleOutputRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceConsoleOutputRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetInstanceConsoleOutputRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetInstanceConsoleOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceConsoleOutputRequest setRemoveSymbols(Boolean removeSymbols) {
        this.removeSymbols = removeSymbols;
        return this;
    }
    public Boolean getRemoveSymbols() {
        return this.removeSymbols;
    }

    public GetInstanceConsoleOutputRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetInstanceConsoleOutputRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
