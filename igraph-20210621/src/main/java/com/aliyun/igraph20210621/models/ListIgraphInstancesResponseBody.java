// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListIgraphInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListIgraphInstancesResponseBodyResult> result;

    public static ListIgraphInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIgraphInstancesResponseBody self = new ListIgraphInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIgraphInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIgraphInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIgraphInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIgraphInstancesResponseBody setResult(java.util.List<ListIgraphInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListIgraphInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListIgraphInstancesResponseBodyResult extends TeaModel {
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        public static ListIgraphInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListIgraphInstancesResponseBodyResult self = new ListIgraphInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListIgraphInstancesResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
