// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelOperatorApiKeysResponseBody extends TeaModel {
    /**
     * <p>The list of API keys.</p>
     */
    @NameInMap("ApiKeys")
    public java.util.List<ListModelOperatorApiKeysResponseBodyApiKeys> apiKeys;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListModelOperatorApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelOperatorApiKeysResponseBody self = new ListModelOperatorApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelOperatorApiKeysResponseBody setApiKeys(java.util.List<ListModelOperatorApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ListModelOperatorApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public ListModelOperatorApiKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelOperatorApiKeysResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListModelOperatorApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelOperatorApiKeysResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListModelOperatorApiKeysResponseBodyApiKeys extends TeaModel {
        /**
         * <p>API KEY ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApiKeyId")
        public Integer apiKeyId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test-apikey</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        public static ListModelOperatorApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            ListModelOperatorApiKeysResponseBodyApiKeys self = new ListModelOperatorApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public ListModelOperatorApiKeysResponseBodyApiKeys setApiKeyId(Integer apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Integer getApiKeyId() {
            return this.apiKeyId;
        }

        public ListModelOperatorApiKeysResponseBodyApiKeys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModelOperatorApiKeysResponseBodyApiKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelOperatorApiKeysResponseBodyApiKeys setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

}
