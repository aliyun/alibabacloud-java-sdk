// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class SearchIgraphDemoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("returnTimeMs")
    public Long returnTimeMs;

    public static SearchIgraphDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchIgraphDemoResponseBody self = new SearchIgraphDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchIgraphDemoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchIgraphDemoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchIgraphDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchIgraphDemoResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public SearchIgraphDemoResponseBody setReturnTimeMs(Long returnTimeMs) {
        this.returnTimeMs = returnTimeMs;
        return this;
    }
    public Long getReturnTimeMs() {
        return this.returnTimeMs;
    }

}
