// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventBusesResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>Success: The request was successful.</li>
     * <li>Other codes: The request failed. For information about error codes, see Error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>InvalidArgument</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1DCF64A-3F2C-5323-ADCB-3F4DF30FAD2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. If the operation was successful, the value true is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1607071602000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>bus_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789098***:eventbus/default</p>
         */
        @NameInMap("EventBusARN")
        public String eventBusARN;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
         * <p>The event buses.</p>
         */
        @NameInMap("EventBuses")
        public java.util.List<ListEventBusesResponseBodyDataEventBuses> eventBuses;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
