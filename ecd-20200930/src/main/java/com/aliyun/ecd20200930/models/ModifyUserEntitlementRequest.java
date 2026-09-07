// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserEntitlementRequest extends TeaModel {
    /**
     * <p>The list of cloud computer IDs for which to add authorized users.</p>
     */
    @NameInMap("AuthorizeDesktopId")
    public java.util.List<String> authorizeDesktopId;

    /**
     * <p>The list of user IDs (usernames).</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of cloud computer IDs for which to remove authorized users.</p>
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
