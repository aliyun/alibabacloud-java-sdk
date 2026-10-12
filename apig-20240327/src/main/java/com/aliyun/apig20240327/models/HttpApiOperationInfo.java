// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiOperationInfo extends TeaModel {
    /**
     * <p>The authentication configuration.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The creation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1719386834548</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The backend service deployment information for the API operation.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Retrieve user information</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether authentication is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The HTTP method of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The mock parameter settings for the API operation.</p>
     */
    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>The name of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>op-xxx</p>
     */
    @NameInMap("operationId")
    public String operationId;

    /**
     * <p>The path of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>/user/123</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The request parameter definition of the API operation.</p>
     */
    @NameInMap("request")
    public HttpApiRequestContract request;

    /**
     * <p>The response parameter definition of the API operation.</p>
     */
    @NameInMap("response")
    public HttpApiResponseContract response;

    /**
     * <p>The publish status of the API operation on the gateway.</p>
     * 
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
