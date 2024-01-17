// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BodyFormat")
    public String bodyFormat;

    @NameInMap("ConstantParameters")
    public String constantParameters;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpMethod")
    public String httpMethod;

    @NameInMap("HttpProtocol")
    public String httpProtocol;

    @NameInMap("Path")
    public String path;

    @NameInMap("PathParameters")
    public String pathParameters;

    @NameInMap("PostBodyDescription")
    public String postBodyDescription;

    @NameInMap("PostBodyType")
    public String postBodyType;

    @NameInMap("RequestBody")
    public String requestBody;

    @NameInMap("RequestHeaders")
    public String requestHeaders;

    @NameInMap("RequestQueries")
    public String requestQueries;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("ServiceAddress")
    public String serviceAddress;

    @NameInMap("ServiceProtocol")
    public String serviceProtocol;

    @NameInMap("ServiceTimeout")
    public Integer serviceTimeout;

    @NameInMap("SystemParameters")
    public String systemParameters;

    @NameInMap("Visibility")
    public String visibility;

    public static ModifyApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiRequest self = new ModifyApiRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ModifyApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ModifyApiRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ModifyApiRequest setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
        return this;
    }
    public String getBodyFormat() {
        return this.bodyFormat;
    }

    public ModifyApiRequest setConstantParameters(String constantParameters) {
        this.constantParameters = constantParameters;
        return this;
    }
    public String getConstantParameters() {
        return this.constantParameters;
    }

    public ModifyApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public ModifyApiRequest setHttpProtocol(String httpProtocol) {
        this.httpProtocol = httpProtocol;
        return this;
    }
    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    public ModifyApiRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModifyApiRequest setPathParameters(String pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public String getPathParameters() {
        return this.pathParameters;
    }

    public ModifyApiRequest setPostBodyDescription(String postBodyDescription) {
        this.postBodyDescription = postBodyDescription;
        return this;
    }
    public String getPostBodyDescription() {
        return this.postBodyDescription;
    }

    public ModifyApiRequest setPostBodyType(String postBodyType) {
        this.postBodyType = postBodyType;
        return this;
    }
    public String getPostBodyType() {
        return this.postBodyType;
    }

    public ModifyApiRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

    public ModifyApiRequest setRequestHeaders(String requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public String getRequestHeaders() {
        return this.requestHeaders;
    }

    public ModifyApiRequest setRequestQueries(String requestQueries) {
        this.requestQueries = requestQueries;
        return this;
    }
    public String getRequestQueries() {
        return this.requestQueries;
    }

    public ModifyApiRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public ModifyApiRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public ModifyApiRequest setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public ModifyApiRequest setServiceProtocol(String serviceProtocol) {
        this.serviceProtocol = serviceProtocol;
        return this;
    }
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    public ModifyApiRequest setServiceTimeout(Integer serviceTimeout) {
        this.serviceTimeout = serviceTimeout;
        return this;
    }
    public Integer getServiceTimeout() {
        return this.serviceTimeout;
    }

    public ModifyApiRequest setSystemParameters(String systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public String getSystemParameters() {
        return this.systemParameters;
    }

    public ModifyApiRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
