// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventBusesResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListEventBusesResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the event buses are successfully queried. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEventBusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventBusesResponseBody self = new ListEventBusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventBusesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventBusesResponseBody setData(ListEventBusesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventBusesResponseBodyData getData() {
        return this.data;
    }

    public ListEventBusesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventBusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventBusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEventBusesResponseBodyDataEventBuses extends TeaModel {
        /**
         * <p>The timestamp that indicates when the event bus was created.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the queried event bus.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the queried event bus.</p>
         */
        @NameInMap("EventBusARN")
        public String eventBusARN;

        /**
         * <p>The name of the queried event bus.</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        public static ListEventBusesResponseBodyDataEventBuses build(java.util.Map<String, ?> map) throws Exception {
            ListEventBusesResponseBodyDataEventBuses self = new ListEventBusesResponseBodyDataEventBuses();
            return TeaModel.build(map, self);
        }

        public ListEventBusesResponseBodyDataEventBuses setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListEventBusesResponseBodyDataEventBuses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEventBusesResponseBodyDataEventBuses setEventBusARN(String eventBusARN) {
            this.eventBusARN = eventBusARN;
            return this;
        }
        public String getEventBusARN() {
            return this.eventBusARN;
        }

        public ListEventBusesResponseBodyDataEventBuses setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

    }

    public static class ListEventBusesResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp that indicates when the event bus was created.</p>
         */
        @NameInMap("EventBuses")
        public java.util.List<ListEventBusesResponseBodyDataEventBuses> eventBuses;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListEventBusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventBusesResponseBodyData self = new ListEventBusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventBusesResponseBodyData setEventBuses(java.util.List<ListEventBusesResponseBodyDataEventBuses> eventBuses) {
            this.eventBuses = eventBuses;
            return this;
        }
        public java.util.List<ListEventBusesResponseBodyDataEventBuses> getEventBuses() {
            return this.eventBuses;
        }

        public ListEventBusesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListEventBusesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
