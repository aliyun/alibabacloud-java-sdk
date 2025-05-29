// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.consolecs20160406.models;

import com.aliyun.tea.*;

public class GetOpenApiListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OpenApiString")
    public String openApiString;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOpenApiListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiListResponseBody self = new GetOpenApiListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenApiListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpenApiListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpenApiListResponseBody setOpenApiString(String openApiString) {
        this.openApiString = openApiString;
        return this;
    }
    public String getOpenApiString() {
        return this.openApiString;
    }

    public GetOpenApiListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenApiListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
