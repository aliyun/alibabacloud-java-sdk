// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckDomainDnsTxtResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // message
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckDomainDnsTxtResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainDnsTxtResponseBody self = new CheckDomainDnsTxtResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainDnsTxtResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CheckDomainDnsTxtResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckDomainDnsTxtResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainDnsTxtResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
