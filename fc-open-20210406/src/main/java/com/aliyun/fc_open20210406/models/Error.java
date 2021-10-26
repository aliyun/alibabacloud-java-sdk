// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Error extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息描述
    @NameInMap("errorMessage")
    public String errorMessage;

    public static Error build(java.util.Map<String, ?> map) throws Exception {
        Error self = new Error();
        return TeaModel.build(map, self);
    }

    public Error setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public Error setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
