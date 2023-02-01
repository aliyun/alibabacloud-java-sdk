// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendModelRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The information about the backend model.</p>
     */
    @NameInMap("BackendModelData")
    public String backendModelData;

    /**
     * <p>The ID of the backend model.</p>
     */
    @NameInMap("BackendModelId")
    public String backendModelId;

    /**
     * <p>The type of the backend service.</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <p>The definition of the backend model.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static ModifyBackendModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendModelRequest self = new ModifyBackendModelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackendModelRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public ModifyBackendModelRequest setBackendModelData(String backendModelData) {
        this.backendModelData = backendModelData;
        return this;
    }
    public String getBackendModelData() {
        return this.backendModelData;
    }

    public ModifyBackendModelRequest setBackendModelId(String backendModelId) {
        this.backendModelId = backendModelId;
        return this;
    }
    public String getBackendModelId() {
        return this.backendModelId;
    }

    public ModifyBackendModelRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public ModifyBackendModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBackendModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyBackendModelRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
