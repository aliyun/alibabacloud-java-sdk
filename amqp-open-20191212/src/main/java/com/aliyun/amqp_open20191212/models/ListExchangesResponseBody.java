// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListExchangesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListExchangesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExchangesResponseBody self = new ListExchangesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExchangesResponseBody setData(ListExchangesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListExchangesResponseBodyData getData() {
        return this.data;
    }

    public ListExchangesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListExchangesResponseBodyDataExchanges extends TeaModel {
        /**
         * <p>The attributes. This parameter is unavailable in the current version.</p>
         */
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        /**
         * <p>Indicates whether the exchange was automatically deleted.</p>
         */
        @NameInMap("AutoDeleteState")
        public Boolean autoDeleteState;

        /**
         * <p>The timestamp that indicates when the exchange was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The exchange type.</p>
         */
        @NameInMap("ExchangeType")
        public String exchangeType;

        /**
         * <p>The exchange name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The vhost name.</p>
         */
        @NameInMap("VHostName")
        public String VHostName;

        public static ListExchangesResponseBodyDataExchanges build(java.util.Map<String, ?> map) throws Exception {
            ListExchangesResponseBodyDataExchanges self = new ListExchangesResponseBodyDataExchanges();
            return TeaModel.build(map, self);
        }

        public ListExchangesResponseBodyDataExchanges setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public ListExchangesResponseBodyDataExchanges setAutoDeleteState(Boolean autoDeleteState) {
            this.autoDeleteState = autoDeleteState;
            return this;
        }
        public Boolean getAutoDeleteState() {
            return this.autoDeleteState;
        }

        public ListExchangesResponseBodyDataExchanges setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListExchangesResponseBodyDataExchanges setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public ListExchangesResponseBodyDataExchanges setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExchangesResponseBodyDataExchanges setVHostName(String VHostName) {
            this.VHostName = VHostName;
            return this;
        }
        public String getVHostName() {
            return this.VHostName;
        }

    }

    public static class ListExchangesResponseBodyData extends TeaModel {
        /**
         * <p>The exchanges.</p>
         */
        @NameInMap("Exchanges")
        public java.util.List<ListExchangesResponseBodyDataExchanges> exchanges;

        /**
         * <p>The maximum number of entries returned.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that marks the end of the current returned page.``</p>
         * <br>
         * <p>*   If the value of this parameter is empty, the next query is not required and the token used to start the next query is unavailable.``</p>
         * <p>*   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.``</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListExchangesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExchangesResponseBodyData self = new ListExchangesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExchangesResponseBodyData setExchanges(java.util.List<ListExchangesResponseBodyDataExchanges> exchanges) {
            this.exchanges = exchanges;
            return this;
        }
        public java.util.List<ListExchangesResponseBodyDataExchanges> getExchanges() {
            return this.exchanges;
        }

        public ListExchangesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListExchangesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
