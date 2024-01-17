// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateApiForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RequestConfig")
    public String requestConfig;

    @NameInMap("RequestParamters")
    public String requestParamters;

    @NameInMap("ResultSample")
    public String resultSample;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("ServiceConfig")
    public String serviceConfig;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    @NameInMap("ServiceParametersMap")
    public String serviceParametersMap;

    @NameInMap("Visibility")
    public String visibility;

    public static CreateApiForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiForInnerRequest self = new CreateApiForInnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateApiForInnerRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateApiForInnerRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateApiForInnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateApiForInnerRequest setRequestConfig(String requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
    public String getRequestConfig() {
        return this.requestConfig;
    }

    public CreateApiForInnerRequest setRequestParamters(String requestParamters) {
        this.requestParamters = requestParamters;
        return this;
    }
    public String getRequestParamters() {
        return this.requestParamters;
    }

    public CreateApiForInnerRequest setResultSample(String resultSample) {
        this.resultSample = resultSample;
        return this;
    }
    public String getResultSample() {
        return this.resultSample;
    }

    public CreateApiForInnerRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateApiForInnerRequest setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public CreateApiForInnerRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public CreateApiForInnerRequest setServiceParametersMap(String serviceParametersMap) {
        this.serviceParametersMap = serviceParametersMap;
        return this;
    }
    public String getServiceParametersMap() {
        return this.serviceParametersMap;
    }

    public CreateApiForInnerRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
