// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesWithCreateResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> namespaces;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeNamespacesWithCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesWithCreateResponseBody self = new DescribeNamespacesWithCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesWithCreateResponseBody setNamespaces(java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public DescribeNamespacesWithCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespacesWithCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespacesWithCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeNamespacesWithCreateResponseBodyNamespaces extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Quota")
        public Integer quota;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ConfigCount")
        public Integer configCount;

        @NameInMap("NamespaceName")
        public String namespaceName;

        public static DescribeNamespacesWithCreateResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesWithCreateResponseBodyNamespaces self = new DescribeNamespacesWithCreateResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

}
