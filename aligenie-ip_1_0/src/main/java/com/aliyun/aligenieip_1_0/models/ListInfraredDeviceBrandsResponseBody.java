// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredDeviceBrandsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, java.util.List<String>> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ListInfraredDeviceBrandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredDeviceBrandsResponseBody self = new ListInfraredDeviceBrandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInfraredDeviceBrandsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInfraredDeviceBrandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInfraredDeviceBrandsResponseBody setResult(java.util.Map<String, java.util.List<String>> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getResult() {
        return this.result;
    }

    public ListInfraredDeviceBrandsResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
