// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAdaptationResponseBody extends TeaModel {
    @NameInMap("AdaptApplyId")
    public Long adaptApplyId;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAdaptationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdaptationResponseBody self = new CreateAdaptationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdaptationResponseBody setAdaptApplyId(Long adaptApplyId) {
        this.adaptApplyId = adaptApplyId;
        return this;
    }
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    public CreateAdaptationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAdaptationResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateAdaptationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAdaptationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAdaptationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
