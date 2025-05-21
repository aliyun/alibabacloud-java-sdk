// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiOperationInfo extends TeaModel {
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <strong>example:</strong>
     * <p>1719386834548</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <strong>example:</strong>
     * <p>获取用户信息</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <strong>example:</strong>
     * <p>GetUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>op-xxx</p>
     */
    @NameInMap("operationId")
    public String operationId;

    /**
     * <strong>example:</strong>
     * <p>/user/123</p>
     */
    @NameInMap("path")
    public String path;

    @NameInMap("request")
    public HttpApiRequestContract request;

    @NameInMap("response")
    public HttpApiResponseContract response;

    /**
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("status")
    public String status;

    public static HttpApiOperationInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiOperationInfo self = new HttpApiOperationInfo();
        return TeaModel.build(map, self);
    }

    public HttpApiOperationInfo setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public HttpApiOperationInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public HttpApiOperationInfo setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public HttpApiOperationInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpApiOperationInfo setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public HttpApiOperationInfo setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public HttpApiOperationInfo setMock(HttpApiMockContract mock) {
        this.mock = mock;
        return this;
    }
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    public HttpApiOperationInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiOperationInfo setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public HttpApiOperationInfo setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HttpApiOperationInfo setRequest(HttpApiRequestContract request) {
        this.request = request;
        return this;
    }
    public HttpApiRequestContract getRequest() {
        return this.request;
    }

    public HttpApiOperationInfo setResponse(HttpApiResponseContract response) {
        this.response = response;
        return this;
    }
    public HttpApiResponseContract getResponse() {
        return this.response;
    }

    public HttpApiOperationInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
