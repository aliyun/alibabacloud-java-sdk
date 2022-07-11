// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetNodeByFlowIdResponseBody extends TeaModel {
    // allowRetry
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    // appName
    @NameInMap("AppName")
    public String appName;

    // dynamicCode
    @NameInMap("DynamicCode")
    public String dynamicCode;

    // dynamicMessage
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // module
    @NameInMap("Module")
    public String module;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetNodeByFlowIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByFlowIdResponseBody self = new GetNodeByFlowIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeByFlowIdResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetNodeByFlowIdResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetNodeByFlowIdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetNodeByFlowIdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetNodeByFlowIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeByFlowIdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetNodeByFlowIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeByFlowIdResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GetNodeByFlowIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeByFlowIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
