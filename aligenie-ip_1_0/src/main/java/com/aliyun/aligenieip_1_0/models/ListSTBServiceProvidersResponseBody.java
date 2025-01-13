// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSTBServiceProvidersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1036C376-7A37-5A73-BE8B-C6DB40107EC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, java.util.List<String>> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
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
