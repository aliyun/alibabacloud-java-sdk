// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListDemoGraphSchemasResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("returnTimeMs")
    public String returnTimeMs;

    public static ListDemoGraphSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDemoGraphSchemasResponseBody self = new ListDemoGraphSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDemoGraphSchemasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDemoGraphSchemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDemoGraphSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDemoGraphSchemasResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public ListDemoGraphSchemasResponseBody setReturnTimeMs(String returnTimeMs) {
        this.returnTimeMs = returnTimeMs;
        return this;
    }
    public String getReturnTimeMs() {
        return this.returnTimeMs;
    }

}
