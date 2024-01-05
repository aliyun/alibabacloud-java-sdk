// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetInstanceDigestResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetInstanceDigestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDigestResponseBody self = new GetInstanceDigestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceDigestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceDigestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceDigestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceDigestResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
