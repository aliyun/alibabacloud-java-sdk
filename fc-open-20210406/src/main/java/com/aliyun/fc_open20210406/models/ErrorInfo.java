// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ErrorInfo extends TeaModel {
    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误堆栈
    @NameInMap("stackTrace")
    public String stackTrace;

    public static ErrorInfo build(java.util.Map<String, ?> map) throws Exception {
        ErrorInfo self = new ErrorInfo();
        return TeaModel.build(map, self);
    }

    public ErrorInfo setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ErrorInfo setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }
    public String getStackTrace() {
        return this.stackTrace;
    }

}
