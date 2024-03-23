// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISRetrieveRouterResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("DebugInfo")
    public java.util.Map<String, ?> debugInfo;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static PostISRetrieveRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostISRetrieveRouterResponseBody self = new PostISRetrieveRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public PostISRetrieveRouterResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public PostISRetrieveRouterResponseBody setDebugInfo(java.util.Map<String, ?> debugInfo) {
        this.debugInfo = debugInfo;
        return this;
    }
    public java.util.Map<String, ?> getDebugInfo() {
        return this.debugInfo;
    }

    public PostISRetrieveRouterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PostISRetrieveRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostISRetrieveRouterResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
