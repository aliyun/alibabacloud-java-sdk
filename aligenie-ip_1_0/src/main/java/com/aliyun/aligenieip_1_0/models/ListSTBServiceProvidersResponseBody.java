// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSTBServiceProvidersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, java.util.List<String>> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListSTBServiceProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSTBServiceProvidersResponseBody self = new ListSTBServiceProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSTBServiceProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSTBServiceProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSTBServiceProvidersResponseBody setResult(java.util.Map<String, java.util.List<String>> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getResult() {
        return this.result;
    }

    public ListSTBServiceProvidersResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
