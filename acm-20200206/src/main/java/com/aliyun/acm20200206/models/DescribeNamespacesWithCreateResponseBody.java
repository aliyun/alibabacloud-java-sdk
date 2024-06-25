// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesWithCreateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> namespaces;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNamespacesWithCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesWithCreateResponseBody self = new DescribeNamespacesWithCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesWithCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespacesWithCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespacesWithCreateResponseBody setNamespaces(java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesWithCreateResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public DescribeNamespacesWithCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNamespacesWithCreateResponseBodyNamespaces extends TeaModel {
        @NameInMap("ConfigCount")
        public Integer configCount;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("Quota")
        public Integer quota;

        @NameInMap("Type")
        public Integer type;

        public static DescribeNamespacesWithCreateResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesWithCreateResponseBodyNamespaces self = new DescribeNamespacesWithCreateResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public DescribeNamespacesWithCreateResponseBodyNamespaces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
