// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateApiKeyShrinkRequest extends TeaModel {
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
    public String serviceIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateApiKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyShrinkRequest self = new CreateApiKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiKeyShrinkRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public CreateApiKeyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApiKeyShrinkRequest setServiceIdsShrink(String serviceIdsShrink) {
        this.serviceIdsShrink = serviceIdsShrink;
        return this;
    }
    public String getServiceIdsShrink() {
        return this.serviceIdsShrink;
    }

    public CreateApiKeyShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
