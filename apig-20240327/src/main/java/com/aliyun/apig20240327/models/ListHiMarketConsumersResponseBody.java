// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHiMarketConsumersResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListHiMarketConsumersResponseBodyData data;

    /**
     * <p>The maximum number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty value indicates that the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListHiMarketConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHiMarketConsumersResponseBody self = new ListHiMarketConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHiMarketConsumersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHiMarketConsumersResponseBody setData(ListHiMarketConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHiMarketConsumersResponseBodyData getData() {
        return this.data;
    }

    public ListHiMarketConsumersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHiMarketConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHiMarketConsumersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHiMarketConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHiMarketConsumersResponseBodyDataContent extends TeaModel {
        /**
         * <p>The consumer ID. You can use this ID to locate the consumer in operations such as GetHiMarketConsumer, DeleteHiMarketConsumer, GetHiMarketConsumerCredential, and ListHiMarketConsumerSubscriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The description of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>Test consumer</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the consumer is a primary consumer.</p>
         */
        @NameInMap("isPrimary")
        public Boolean isPrimary;

        /**
         * <p>The name of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        public static ListHiMarketConsumersResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListHiMarketConsumersResponseBodyDataContent self = new ListHiMarketConsumersResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListHiMarketConsumersResponseBodyDataContent setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListHiMarketConsumersResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHiMarketConsumersResponseBodyDataContent setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public ListHiMarketConsumersResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListHiMarketConsumersResponseBodyData extends TeaModel {
        /**
         * <p>The list of consumers. Each element represents a HiMarket consumer.</p>
         */
        @NameInMap("content")
        public java.util.List<ListHiMarketConsumersResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
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
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListHiMarketConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHiMarketConsumersResponseBodyData self = new ListHiMarketConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHiMarketConsumersResponseBodyData setContent(java.util.List<ListHiMarketConsumersResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListHiMarketConsumersResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListHiMarketConsumersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHiMarketConsumersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHiMarketConsumersResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
