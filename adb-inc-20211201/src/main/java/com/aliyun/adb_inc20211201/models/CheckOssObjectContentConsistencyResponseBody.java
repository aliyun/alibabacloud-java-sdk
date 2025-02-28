// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CheckOssObjectContentConsistencyResponseBody extends TeaModel {
    @NameInMap("IsConsistent")
    public Boolean isConsistent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static CheckOssObjectContentConsistencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckOssObjectContentConsistencyResponseBody self = new CheckOssObjectContentConsistencyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckOssObjectContentConsistencyResponseBody setIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
        return this;
    }
    public Boolean getIsConsistent() {
        return this.isConsistent;
    }

    public CheckOssObjectContentConsistencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckOssObjectContentConsistencyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckOssObjectContentConsistencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckOssObjectContentConsistencyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckOssObjectContentConsistencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
