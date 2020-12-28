// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponseBody self = new DescribeNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesResponseBody setNamespaces(java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public DescribeNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeNamespacesResponseBodyNamespaces extends TeaModel {
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

        public static DescribeNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespaces self = new DescribeNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespaces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeNamespacesResponseBodyNamespaces setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespacesResponseBodyNamespaces setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

    }

}
