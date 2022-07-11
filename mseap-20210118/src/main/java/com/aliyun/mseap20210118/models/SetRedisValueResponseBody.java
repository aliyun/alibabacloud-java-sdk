// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SetRedisValueResponseBody extends TeaModel {
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
    public Boolean module;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static SetRedisValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRedisValueResponseBody self = new SetRedisValueResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRedisValueResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public SetRedisValueResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetRedisValueResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SetRedisValueResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SetRedisValueResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetRedisValueResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SetRedisValueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SetRedisValueResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public SetRedisValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetRedisValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
