// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelGroupRequest extends TeaModel {
    /**
     * <p>The nullable description. The maximum length is 1024 UTF-16 code units.</p>
     * 
     * <strong>example:</strong>
     * <p>Model group for service integration</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The group version obtained from the most recent Get operation. A stale version returns Conflict.ModelGroupChanged. Submitting the same expectedVersion, name, description, and modelCardIds retries the Failed or PartiallyFailed configuration for the same version, reuses the operationId, and does not increment the group version. Pending, Running, or Succeeded states are not forcibly reset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    /**
     * <p>The actual or logical model identities within the same instance. The list can be null and must not contain duplicates. Model groups are not accepted as members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelCardIds")
    public java.util.List<String> modelCardIds;

    /**
     * <p>The unique name within the instance. The length is 1 to 128 UTF-8 bytes after trimming.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beta-model-group</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateModelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelGroupRequest self = new UpdateModelGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelGroupRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateModelGroupRequest setModelCardIds(java.util.List<String> modelCardIds) {
        this.modelCardIds = modelCardIds;
        return this;
    }
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    public UpdateModelGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
