// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListExchangesResponseBodyData data;

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
        @NameInMap("Attributes")
        public java.util.Map<String, ?> attributes;

        @NameInMap("AutoDeleteState")
        public Boolean autoDeleteState;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExchangeType")
        public String exchangeType;

        @NameInMap("Name")
        public String name;

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
         * <p>Exchange。</p>
         */
        @NameInMap("Exchanges")
        public java.util.List<ListExchangesResponseBodyDataExchanges> exchanges;

        @NameInMap("MaxResults")
        public Integer maxResults;

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
