// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelRequest extends TeaModel {
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
     * <p>The type of the backend service.</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <p>The description of the backend model.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static CreateBackendModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendModelRequest self = new CreateBackendModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackendModelRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public CreateBackendModelRequest setBackendModelData(String backendModelData) {
        this.backendModelData = backendModelData;
        return this;
    }
    public String getBackendModelData() {
        return this.backendModelData;
    }

    public CreateBackendModelRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public CreateBackendModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBackendModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateBackendModelRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
