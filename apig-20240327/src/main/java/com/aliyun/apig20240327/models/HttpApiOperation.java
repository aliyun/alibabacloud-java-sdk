// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiOperation extends TeaModel {
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <strong>example:</strong>
     * <p>获取用户信息</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/user</p>
     */
    @NameInMap("path")
    public String path;

    @NameInMap("request")
    public HttpApiRequestContract request;

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
