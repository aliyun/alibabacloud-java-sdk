// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelRequest extends TeaModel {
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("BackendModelData")
    public String backendModelData;

    @NameInMap("BackendType")
    public String backendType;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

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
