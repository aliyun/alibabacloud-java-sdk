// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserEntitlementRequest extends TeaModel {
    /**
     * <p>The IDs of cloud desktops which you want to grant permissions to regular users.</p>
     */
    @NameInMap("AuthorizeDesktopId")
    public java.util.List<String> authorizeDesktopId;

    /**
     * <p>The IDs of regular users.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of cloud desktops which you want to revoke permissions from regular users.</p>
     */
    @NameInMap("RevokeDesktopId")
    public java.util.List<String> revokeDesktopId;

    public static ModifyUserEntitlementRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEntitlementRequest self = new ModifyUserEntitlementRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserEntitlementRequest setAuthorizeDesktopId(java.util.List<String> authorizeDesktopId) {
        this.authorizeDesktopId = authorizeDesktopId;
        return this;
    }
    public java.util.List<String> getAuthorizeDesktopId() {
        return this.authorizeDesktopId;
    }

    public ModifyUserEntitlementRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ModifyUserEntitlementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserEntitlementRequest setRevokeDesktopId(java.util.List<String> revokeDesktopId) {
        this.revokeDesktopId = revokeDesktopId;
        return this;
    }
    public java.util.List<String> getRevokeDesktopId() {
        return this.revokeDesktopId;
    }

}
