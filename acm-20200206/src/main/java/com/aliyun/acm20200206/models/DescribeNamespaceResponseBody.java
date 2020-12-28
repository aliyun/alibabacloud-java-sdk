// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Namespace")
    public DescribeNamespaceResponseBodyNamespace namespace;

    public static DescribeNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponseBody self = new DescribeNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResponseBody setNamespace(DescribeNamespaceResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public DescribeNamespaceResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public static class DescribeNamespaceResponseBodyNamespace extends TeaModel {
        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeNamespaceResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResponseBodyNamespace self = new DescribeNamespaceResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResponseBodyNamespace setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
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

    }

}
