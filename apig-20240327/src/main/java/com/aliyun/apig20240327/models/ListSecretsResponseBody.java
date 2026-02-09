// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    /**
     * <p>Code of the request</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("data")
    public ListSecretsResponseBodyData data;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2F270C0B-7D6A-5DA7-93E2-******</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponseBody self = new ListSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSecretsResponseBody setData(ListSecretsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSecretsResponseBodyData getData() {
        return this.data;
    }

    public ListSecretsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSecretsResponseBodyDataItems extends TeaModel {
        /**
         * <p>Unix timestamp when the secret was created</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>Gateway type associated with the secret</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>KMS configuration object</p>
         */
        @NameInMap("kmsConfig")
        public KMSConfig kmsConfig;

        /**
         * <p>Name of the secret</p>
         * 
         * <strong>example:</strong>
         * <p>test-secret</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Number of resources referencing this secret</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("referenceCount")
        public Integer referenceCount;

        /**
         * <p>Source of the ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("secretId")
        public String secretId;

        /**
         * <p>Source of the secret</p>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        @NameInMap("secretSource")
        public String secretSource;

        /**
         * <p>Current status of the secret</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Unix timestamp when the secret was last updated</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static ListSecretsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodyDataItems self = new ListSecretsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListSecretsResponseBodyDataItems setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListSecretsResponseBodyDataItems setKmsConfig(KMSConfig kmsConfig) {
            this.kmsConfig = kmsConfig;
            return this;
        }
        public KMSConfig getKmsConfig() {
            return this.kmsConfig;
        }

        public ListSecretsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecretsResponseBodyDataItems setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public ListSecretsResponseBodyDataItems setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ListSecretsResponseBodyDataItems setSecretSource(String secretSource) {
            this.secretSource = secretSource;
            return this;
        }
        public String getSecretSource() {
            return this.secretSource;
        }

        public ListSecretsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSecretsResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListSecretsResponseBodyData extends TeaModel {
        /**
         * <p>Array of secret details</p>
         */
        @NameInMap("items")
        public java.util.List<ListSecretsResponseBodyDataItems> items;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>Number of items per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>Total number of records matching the query</p>
         * 
         * <strong>example:</strong>
         * <p>104</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListSecretsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodyData self = new ListSecretsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodyData setItems(java.util.List<ListSecretsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListSecretsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListSecretsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSecretsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecretsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
