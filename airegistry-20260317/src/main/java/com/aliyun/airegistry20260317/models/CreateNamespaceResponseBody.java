// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponseBody extends TeaModel {
    /**
     * <p>The namespace creation result.</p>
     */
    @NameInMap("Data")
    public CreateNamespaceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponseBody self = new CreateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponseBody setData(CreateNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateNamespaceResponseBodyData extends TeaModel {
        /**
         * <p>The namespace ID. The default namespace cannot be queried, modified, or deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>a2a9310a-9d91-4283-b4e2-844f6d45fe64</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        public static CreateNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceResponseBodyData self = new CreateNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

    }

}
