// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class CmdbCommonPostAPIResponseBody extends TeaModel {
    // allowRetry
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    // cc
    @NameInMap("Cc")
    public Integer cc;

    // errorCode
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // errorCodeMsg
    @NameInMap("ErrorCodeMsg")
    public String errorCodeMsg;

    // errorMessage
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // exceptionName
    @NameInMap("ExceptionName")
    public String exceptionName;

    // success
    @NameInMap("Success")
    public Boolean success;

    // value
    @NameInMap("Value")
    public Long value;

    public static CmdbCommonPostAPIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CmdbCommonPostAPIResponseBody self = new CmdbCommonPostAPIResponseBody();
        return TeaModel.build(map, self);
    }

    public CmdbCommonPostAPIResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CmdbCommonPostAPIResponseBody setCc(Integer cc) {
        this.cc = cc;
        return this;
    }
    public Integer getCc() {
        return this.cc;
    }

    public CmdbCommonPostAPIResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CmdbCommonPostAPIResponseBody setErrorCodeMsg(String errorCodeMsg) {
        this.errorCodeMsg = errorCodeMsg;
        return this;
    }
    public String getErrorCodeMsg() {
        return this.errorCodeMsg;
    }

    public CmdbCommonPostAPIResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CmdbCommonPostAPIResponseBody setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
        return this;
    }
    public String getExceptionName() {
        return this.exceptionName;
    }

    public CmdbCommonPostAPIResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CmdbCommonPostAPIResponseBody setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
