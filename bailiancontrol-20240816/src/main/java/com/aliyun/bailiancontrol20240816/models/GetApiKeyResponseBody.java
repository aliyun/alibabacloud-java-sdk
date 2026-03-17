// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailiancontrol20240816.models;

import com.aliyun.tea.*;

public class GetApiKeyResponseBody extends TeaModel {
    @NameInMap("apiKey")
    public GetApiKeyResponseBodyApiKey apiKey;

    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiKeyResponseBody self = new GetApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiKeyResponseBody setApiKey(GetApiKeyResponseBodyApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public GetApiKeyResponseBodyApiKey getApiKey() {
        return this.apiKey;
    }

    public GetApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure extends TeaModel {
        @NameInMap("agents")
        public java.util.List<String> agents;

        @NameInMap("highCodeApps")
        public java.util.List<String> highCodeApps;

        @NameInMap("isAllowAccessAllApps")
        public Boolean isAllowAccessAllApps;

        @NameInMap("workflows")
        public java.util.List<String> workflows;

        public static GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure self = new GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure setAgents(java.util.List<String> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<String> getAgents() {
            return this.agents;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure setHighCodeApps(java.util.List<String> highCodeApps) {
            this.highCodeApps = highCodeApps;
            return this;
        }
        public java.util.List<String> getHighCodeApps() {
            return this.highCodeApps;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure setIsAllowAccessAllApps(Boolean isAllowAccessAllApps) {
            this.isAllowAccessAllApps = isAllowAccessAllApps;
            return this;
        }
        public Boolean getIsAllowAccessAllApps() {
            return this.isAllowAccessAllApps;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure setWorkflows(java.util.List<String> workflows) {
            this.workflows = workflows;
            return this;
        }
        public java.util.List<String> getWorkflows() {
            return this.workflows;
        }

    }

    public static class GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure extends TeaModel {
        @NameInMap("defineModels")
        public java.util.List<String> defineModels;

        @NameInMap("deployments")
        public java.util.List<String> deployments;

        @NameInMap("isAllowAccessAllModels")
        public Boolean isAllowAccessAllModels;

        @NameInMap("models")
        public java.util.List<String> models;

        public static GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure self = new GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure setDefineModels(java.util.List<String> defineModels) {
            this.defineModels = defineModels;
            return this;
        }
        public java.util.List<String> getDefineModels() {
            return this.defineModels;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure setDeployments(java.util.List<String> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<String> getDeployments() {
            return this.deployments;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure setIsAllowAccessAllModels(Boolean isAllowAccessAllModels) {
            this.isAllowAccessAllModels = isAllowAccessAllModels;
            return this;
        }
        public Boolean getIsAllowAccessAllModels() {
            return this.isAllowAccessAllModels;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure setModels(java.util.List<String> models) {
            this.models = models;
            return this;
        }
        public java.util.List<String> getModels() {
            return this.models;
        }

    }

    public static class GetApiKeyResponseBodyApiKeyAuthSetModel extends TeaModel {
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        @NameInMap("authAppStructure")
        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure authAppStructure;

        @NameInMap("authModelStructure")
        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure authModelStructure;

        @NameInMap("authSetMode")
        public String authSetMode;

        public static GetApiKeyResponseBodyApiKeyAuthSetModel build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyApiKeyAuthSetModel self = new GetApiKeyResponseBodyApiKeyAuthSetModel();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModel setAccessIps(java.util.List<String> accessIps) {
            this.accessIps = accessIps;
            return this;
        }
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModel setAuthAppStructure(GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure authAppStructure) {
            this.authAppStructure = authAppStructure;
            return this;
        }
        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthAppStructure getAuthAppStructure() {
            return this.authAppStructure;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModel setAuthModelStructure(GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure authModelStructure) {
            this.authModelStructure = authModelStructure;
            return this;
        }
        public GetApiKeyResponseBodyApiKeyAuthSetModelAuthModelStructure getAuthModelStructure() {
            return this.authModelStructure;
        }

        public GetApiKeyResponseBodyApiKeyAuthSetModel setAuthSetMode(String authSetMode) {
            this.authSetMode = authSetMode;
            return this;
        }
        public String getAuthSetMode() {
            return this.authSetMode;
        }

    }

    public static class GetApiKeyResponseBodyApiKey extends TeaModel {
        @NameInMap("apiKeyValue")
        public String apiKeyValue;

        @NameInMap("apikeyId")
        public String apikeyId;

        @NameInMap("authSetModel")
        public GetApiKeyResponseBodyApiKeyAuthSetModel authSetModel;

        @NameInMap("blocked")
        public String blocked;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

        @NameInMap("expireTime")
        public Long expireTime;

        @NameInMap("extData")
        public String extData;

        @NameInMap("parentUid")
        public String parentUid;

        @NameInMap("uid")
        public String uid;

        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetApiKeyResponseBodyApiKey build(java.util.Map<String, ?> map) throws Exception {
            GetApiKeyResponseBodyApiKey self = new GetApiKeyResponseBodyApiKey();
            return TeaModel.build(map, self);
        }

        public GetApiKeyResponseBodyApiKey setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public GetApiKeyResponseBodyApiKey setApikeyId(String apikeyId) {
            this.apikeyId = apikeyId;
            return this;
        }
        public String getApikeyId() {
            return this.apikeyId;
        }

        public GetApiKeyResponseBodyApiKey setAuthSetModel(GetApiKeyResponseBodyApiKeyAuthSetModel authSetModel) {
            this.authSetModel = authSetModel;
            return this;
        }
        public GetApiKeyResponseBodyApiKeyAuthSetModel getAuthSetModel() {
            return this.authSetModel;
        }

        public GetApiKeyResponseBodyApiKey setBlocked(String blocked) {
            this.blocked = blocked;
            return this;
        }
        public String getBlocked() {
            return this.blocked;
        }

        public GetApiKeyResponseBodyApiKey setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApiKeyResponseBodyApiKey setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetApiKeyResponseBodyApiKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiKeyResponseBodyApiKey setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetApiKeyResponseBodyApiKey setExtData(String extData) {
            this.extData = extData;
            return this;
        }
        public String getExtData() {
            return this.extData;
        }

        public GetApiKeyResponseBodyApiKey setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public GetApiKeyResponseBodyApiKey setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetApiKeyResponseBodyApiKey setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
