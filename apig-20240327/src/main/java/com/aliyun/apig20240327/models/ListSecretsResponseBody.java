// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListSecretsResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("gatewayType")
        public String gatewayType;

        @NameInMap("kmsConfig")
        public KMSConfig kmsConfig;

        @NameInMap("name")
        public String name;

        @NameInMap("referenceCount")
        public Integer referenceCount;

        @NameInMap("secretId")
        public String secretId;

        @NameInMap("secretSource")
        public String secretSource;

        @NameInMap("status")
        public String status;

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
        @NameInMap("items")
        public java.util.List<ListSecretsResponseBodyDataItems> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

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
