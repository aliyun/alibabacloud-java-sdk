// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RevokeApiKeyShrinkRequest extends TeaModel {
    /**
     * <p>API KEY ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xxxxxx</p>
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
     * <p>The list of service IDs to be authorized.</p>
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

    public static RevokeApiKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApiKeyShrinkRequest self = new RevokeApiKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApiKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public RevokeApiKeyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeApiKeyShrinkRequest setServiceIdsShrink(String serviceIdsShrink) {
        this.serviceIdsShrink = serviceIdsShrink;
        return this;
    }
    public String getServiceIdsShrink() {
        return this.serviceIdsShrink;
    }

    public RevokeApiKeyShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
