// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Namespaces")
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces;

    /**
     * <strong>example:</strong>
     * <p>3116581E-C664-4D3A-A055-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesResponseBody self = new DescribeNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespacesResponseBody setNamespaces(java.util.List<DescribeNamespacesResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<DescribeNamespacesResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public DescribeNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNamespacesResponseBodyNamespaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ConfigCount")
        public Integer configCount;

        /**
         * <strong>example:</strong>
         * <p>3115d2bf-1f44-47bf-a855-****</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeNamespacesResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespacesResponseBodyNamespaces self = new DescribeNamespacesResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public DescribeNamespacesResponseBodyNamespaces setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespacesResponseBodyNamespaces setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespacesResponseBodyNamespaces setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public DescribeNamespacesResponseBodyNamespaces setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
