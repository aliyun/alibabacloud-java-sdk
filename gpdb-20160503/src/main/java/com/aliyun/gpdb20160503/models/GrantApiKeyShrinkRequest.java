// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantApiKeyShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the API key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxxxxx</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of service IDs to authorize.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceIds")
    public String serviceIdsShrink;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GrantApiKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantApiKeyShrinkRequest self = new GrantApiKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantApiKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GrantApiKeyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantApiKeyShrinkRequest setServiceIdsShrink(String serviceIdsShrink) {
        this.serviceIdsShrink = serviceIdsShrink;
        return this;
    }
    public String getServiceIdsShrink() {
        return this.serviceIdsShrink;
    }

    public GrantApiKeyShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
