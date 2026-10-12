// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of key information.</p>
     */
    @NameInMap("data")
    public ListSecretsResponseBodyData data;

    /**
     * <p>The response message.</p>
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
     * <p>3A3D1392-0F71-5A10-9AE8-89C434696966</p>
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
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1725617840096</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The gateway type.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>The KMS configuration information.</p>
         */
        @NameInMap("kmsConfig")
        public KMSConfig kmsConfig;

        /**
         * <p>The key name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_secret</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource count of resources that reference the current key.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("referenceCount")
        public Integer referenceCount;

        /**
         * <p>The key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sec-d5e6shmm1hkoxxxxxxxx</p>
         */
        @NameInMap("secretId")
        public String secretId;

        /**
         * <p>The key source.</p>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        @NameInMap("secretSource")
        public String secretSource;

        /**
         * <p>The key status. Valid values:</p>
         * <ul>
         * <li>ENABLE: Enabled.</li>
         * <li>DISABLE: Disabled.</li>
         * <li>DELETED: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The update timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1721116090326</p>
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
         * <p>The list of key details.</p>
         */
        @NameInMap("items")
        public java.util.List<ListSecretsResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
