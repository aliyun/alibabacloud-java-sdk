// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20bcdc9453524b78a8beb1f6de21edb7</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;ServiceAddress\&quot;:\&quot;<a href="http://121.40.XX.XX%5C%5C%22%7D">http://121.40.XX.XX\\&quot;}</a></p>
     */
    @NameInMap("BackendModelData")
    public String backendModelData;

    /**
     * <strong>example:</strong>
     * <p>3bb6375bc71c4e4c95ce05b4e7a55a9d</p>
     */
    @NameInMap("BackendModelId")
    public String backendModelId;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <strong>example:</strong>
     * <p>modify plugin first</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
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
