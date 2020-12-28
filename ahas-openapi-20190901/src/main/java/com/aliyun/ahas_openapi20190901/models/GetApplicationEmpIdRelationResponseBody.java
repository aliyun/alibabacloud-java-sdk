// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetApplicationEmpIdRelationResponseBody extends TeaModel {
    @NameInMap("EmpIds")
    public java.util.List<String> empIds;

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

    public static GetApplicationEmpIdRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationEmpIdRelationResponseBody self = new GetApplicationEmpIdRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationEmpIdRelationResponseBody setEmpIds(java.util.List<String> empIds) {
        this.empIds = empIds;
        return this;
    }
    public java.util.List<String> getEmpIds() {
        return this.empIds;
    }

    public GetApplicationEmpIdRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationEmpIdRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationEmpIdRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApplicationEmpIdRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationEmpIdRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
