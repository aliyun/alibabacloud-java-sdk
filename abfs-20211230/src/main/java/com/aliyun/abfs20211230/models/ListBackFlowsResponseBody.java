// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class ListBackFlowsResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public String code;

    // error message
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // result
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListBackFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackFlowsResponseBody self = new ListBackFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBackFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBackFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBackFlowsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
