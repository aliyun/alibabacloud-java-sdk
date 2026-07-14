// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListApiKeysResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListApiKeysResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiKeysResponseBody self = new ListApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiKeysResponseBody setItems(java.util.List<ListApiKeysResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListApiKeysResponseBodyItems> getItems() {
        return this.items;
    }

    public ListApiKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiKeysResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListApiKeysResponseBodyItemsAuthServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agdb-xxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        public static ListApiKeysResponseBodyItemsAuthServices build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyItemsAuthServices self = new ListApiKeysResponseBodyItemsAuthServices();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyItemsAuthServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListApiKeysResponseBodyItemsAuthServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

    public static class ListApiKeysResponseBodyItems extends TeaModel {
        @NameInMap("AuthServices")
        public java.util.List<ListApiKeysResponseBodyItemsAuthServices> authServices;

        /**
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>my first api key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>api-xxxxxxxx</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <strong>example:</strong>
         * <p>my first api key</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <strong>example:</strong>
         * <p>sk-12345****</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        public static ListApiKeysResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListApiKeysResponseBodyItems self = new ListApiKeysResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListApiKeysResponseBodyItems setAuthServices(java.util.List<ListApiKeysResponseBodyItemsAuthServices> authServices) {
            this.authServices = authServices;
            return this;
        }
        public java.util.List<ListApiKeysResponseBodyItemsAuthServices> getAuthServices() {
            return this.authServices;
        }

        public ListApiKeysResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApiKeysResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiKeysResponseBodyItems setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListApiKeysResponseBodyItems setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListApiKeysResponseBodyItems setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

    }

}
