// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentRunnableResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CheckExperimentRunnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentRunnableResponseBody self = new CheckExperimentRunnableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckExperimentRunnableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckExperimentRunnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckExperimentRunnableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckExperimentRunnableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
