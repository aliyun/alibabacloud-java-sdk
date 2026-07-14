// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test secret</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my api key</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public CreateApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApiKeyRequest setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public CreateApiKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
