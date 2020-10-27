// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AccountId")
    @Validation(required = true)
    public Long accountId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Permission")
    @Validation(required = true)
    public String permission;

    public static CreateNetworkInterfacePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionRequest self = new CreateNetworkInterfacePermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkInterfacePermissionRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public CreateNetworkInterfacePermissionRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateNetworkInterfacePermissionRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

}
