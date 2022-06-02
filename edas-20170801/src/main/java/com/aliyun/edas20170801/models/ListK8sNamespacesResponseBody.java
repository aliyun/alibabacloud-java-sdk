// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sNamespacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListK8sNamespacesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListK8sNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sNamespacesResponseBody self = new ListK8sNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sNamespacesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListK8sNamespacesResponseBody setData(java.util.List<ListK8sNamespacesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListK8sNamespacesResponseBodyData> getData() {
        return this.data;
    }

    public ListK8sNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListK8sNamespacesResponseBodyData extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        public static ListK8sNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sNamespacesResponseBodyData self = new ListK8sNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListK8sNamespacesResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
