// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34e94fcd3e2e47a49824a89b8f92cb5e</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;ServiceAddress\&quot;:\&quot;<a href="http://apigateway-echo-redux.alicloudapi.com:8080%5C%5C%22%7D">http://apigateway-echo-redux.alicloudapi.com:8080\\&quot;}</a></p>
     */
    @NameInMap("BackendModelData")
    public String backendModelData;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <strong>example:</strong>
     * <p>model description</p>
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
