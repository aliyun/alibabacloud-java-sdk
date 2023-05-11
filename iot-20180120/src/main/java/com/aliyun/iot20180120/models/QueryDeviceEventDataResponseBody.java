// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The event records returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceEventDataResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceEventDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventDataResponseBody self = new QueryDeviceEventDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceEventDataResponseBody setData(QueryDeviceEventDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceEventDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceEventDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceEventDataResponseBodyDataListEventInfo extends TeaModel {
        /**
         * <p>The type of the event. Valid values:</p>
         * <br>
         * <p>*   **info**: information.</p>
         * <p>*   **alert**: alert.</p>
         * <p>*   **error**: error.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The identifier of the event.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameter of the event. The value is a string in the MAP format.</p>
         */
        @NameInMap("OutputData")
        public String outputData;

        /**
         * <p>The time when the event occurred. The value is a timestamp in milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryDeviceEventDataResponseBodyDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyDataListEventInfo self = new QueryDeviceEventDataResponseBodyDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceEventDataResponseBodyDataList extends TeaModel {
        @NameInMap("EventInfo")
        public java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> eventInfo;

        public static QueryDeviceEventDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyDataList self = new QueryDeviceEventDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyDataList setEventInfo(java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceEventDataResponseBodyData extends TeaModel {
        /**
         * <p>The array of events. Each element represents an event.</p>
         */
        @NameInMap("List")
        public QueryDeviceEventDataResponseBodyDataList list;

        /**
         * <p>The start time of the event records on the next page. The value is a timestamp in milliseconds.  </p>
         * <br>
         * <p>- If the **Asc** parameter is set to 0, you can specify this value for the **EndTime** parameter when you call this operation again to query the next page of event records.</p>
         * <p>- If the **Asc** parameter is set to 1, you can specify this value for the **StartTime** parameter when you call this operation again to query the next page of event records.</p>
         */
        @NameInMap("NextTime")
        public Long nextTime;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <br>
         * <p>*   **true**: The next page exists. The value of the **NextTime** parameter is returned. For more information, see the description of the **NextTime** parameter in this topic.</p>
         * <p>*   **false**: The next page does not exist.</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceEventDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyData self = new QueryDeviceEventDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyData setList(QueryDeviceEventDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceEventDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceEventDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceEventDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
