// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiOperation extends TeaModel {
    /**
     * <p>The authentication configurations.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The deployment configurations.</p>
     */
    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The operation description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a operation description.</p>
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
     * <p>The HTTP method.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The mocking configuration of the operation. This field takes effect only when the API publishing scenario is Mock.</p>
     */
    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>The operation name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The operation path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/user</p>
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

    public static HttpApiOperation build(java.util.Map<String, ?> map) throws Exception {
        HttpApiOperation self = new HttpApiOperation();
        return TeaModel.build(map, self);
    }

    public HttpApiOperation setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public HttpApiOperation setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public HttpApiOperation setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpApiOperation setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public HttpApiOperation setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public HttpApiOperation setMock(HttpApiMockContract mock) {
        this.mock = mock;
        return this;
    }
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    public HttpApiOperation setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiOperation setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HttpApiOperation setRequest(HttpApiRequestContract request) {
        this.request = request;
        return this;
    }
    public HttpApiRequestContract getRequest() {
        return this.request;
    }

    public HttpApiOperation setResponse(HttpApiResponseContract response) {
        this.response = response;
        return this;
    }
    public HttpApiResponseContract getResponse() {
        return this.response;
    }

}
