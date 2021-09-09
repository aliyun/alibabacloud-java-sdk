// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckNamespacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListAckNamespacesResponseBodyResult> result;

    public static ListAckNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAckNamespacesResponseBody self = new ListAckNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAckNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAckNamespacesResponseBody setResult(java.util.List<ListAckNamespacesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAckNamespacesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAckNamespacesResponseBodyResult extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("status")
        public String status;

        public static ListAckNamespacesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAckNamespacesResponseBodyResult self = new ListAckNamespacesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAckNamespacesResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAckNamespacesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
