// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponseBody extends TeaModel {
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

    @NameInMap("Namespace")
    public DescribeNamespaceResponseBodyNamespace namespace;

    /**
     * <strong>example:</strong>
     * <p>3116581E-C664-4D3A-A055-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponseBody self = new DescribeNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResponseBody setNamespace(DescribeNamespaceResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public DescribeNamespaceResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public DescribeNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNamespaceResponseBodyNamespace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2c017****</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>acm.aliyun.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>6/eQ0****</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        public static DescribeNamespaceResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResponseBodyNamespace self = new DescribeNamespaceResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResponseBodyNamespace setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public DescribeNamespaceResponseBodyNamespace setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeNamespaceResponseBodyNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNamespaceResponseBodyNamespace setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNamespaceResponseBodyNamespace setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

    }

}
