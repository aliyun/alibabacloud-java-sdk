// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiOperationInfo extends TeaModel {
    /**
     * <p>The authentication configurations of the operation.</p>
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
     * <p>The backend service deployment information of the operation.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The operation description.</p>
     * 
     * <strong>example:</strong>
     * <p>A example operation.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>The HTTP method of the operation.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>TRACE</li>
     * <li>HEAD</li>
     * <li>DELETE</li>
     * <li>POST</li>
     * <li>GET</li>
     * <li>CONNECT</li>
     * <li>OPTIONS</li>
     * <li>PUT</li>
     * <li>PATCH</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The mocked parameters of the operation.</p>
     */
    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>The operation name.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The operation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>op-xxx</p>
     */
    @NameInMap("operationId")
    public String operationId;

    /**
     * <p>The operation path.</p>
     * 
     * <strong>example:</strong>
     * <p>/user/123</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The request parameters of the operation.</p>
     */
    @NameInMap("request")
    public HttpApiRequestContract request;

    /**
     * <p>The response parameters of the operation.</p>
     */
    @NameInMap("response")
    public HttpApiResponseContract response;

    /**
     * <p>The operation publishing status on the instance.</p>
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
