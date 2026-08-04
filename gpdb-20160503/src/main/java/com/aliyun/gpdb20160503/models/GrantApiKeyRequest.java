// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantApiKeyRequest extends TeaModel {
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

    public static GrantApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantApiKeyRequest self = new GrantApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public GrantApiKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GrantApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantApiKeyRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public GrantApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
