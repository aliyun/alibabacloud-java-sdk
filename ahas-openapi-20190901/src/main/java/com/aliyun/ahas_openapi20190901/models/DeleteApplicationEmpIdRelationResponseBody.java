// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DeleteApplicationEmpIdRelationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteApplicationEmpIdRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationEmpIdRelationResponseBody self = new DeleteApplicationEmpIdRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationEmpIdRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApplicationEmpIdRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteApplicationEmpIdRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteApplicationEmpIdRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApplicationEmpIdRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
