// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSceneCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static ListSceneCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSceneCategoryResponseBody self = new ListSceneCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSceneCategoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSceneCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSceneCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSceneCategoryResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}
