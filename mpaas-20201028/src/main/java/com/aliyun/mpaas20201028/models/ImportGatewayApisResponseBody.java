// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ImportGatewayApisResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("ApiCount")
    public Integer apiCount;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("ErrorField")
    public String errorField;

    @NameInMap("GroupCount")
    public Integer groupCount;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ImportGatewayApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportGatewayApisResponseBody self = new ImportGatewayApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportGatewayApisResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ImportGatewayApisResponseBody setApiCount(Integer apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Integer getApiCount() {
        return this.apiCount;
    }

    public ImportGatewayApisResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public ImportGatewayApisResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public ImportGatewayApisResponseBody setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Integer getGroupCount() {
        return this.groupCount;
    }

    public ImportGatewayApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportGatewayApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportGatewayApisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportGatewayApisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportGatewayApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
