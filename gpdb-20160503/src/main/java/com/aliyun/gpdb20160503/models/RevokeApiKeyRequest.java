// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RevokeApiKeyRequest extends TeaModel {
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
    public java.util.List<String> serviceIds;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RevokeApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApiKeyRequest self = new RevokeApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApiKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public RevokeApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeApiKeyRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public RevokeApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
