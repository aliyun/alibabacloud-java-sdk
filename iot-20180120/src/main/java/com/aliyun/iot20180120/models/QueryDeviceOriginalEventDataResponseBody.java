// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalEventDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.device.InvalidIoTId</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The event records returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceOriginalEventDataResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeds.</p>
     * <ul>
     * <li>true: The call succeeded.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceOriginalEventDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalEventDataResponseBody self = new QueryDeviceOriginalEventDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalEventDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalEventDataResponseBody setData(QueryDeviceOriginalEventDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalEventDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceOriginalEventDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalEventDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalEventDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceOriginalEventDataResponseBodyDataListEventInfo extends TeaModel {
        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li>info: information.</li>
         * <li>alert: alert.</li>
         * <li>error: error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The identifier of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>PowerOff</p>
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
         * 
         * <strong>example:</strong>
         * <p>{&quot;structArgs&quot;:{&quot;structchildFLOATf71c20e&quot;:1.23}}</p>
         */
        @NameInMap("OutputData")
        public String outputData;

        /**
         * <p>The time when the event occurred. The value is a 13-digit timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579163099000</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryDeviceOriginalEventDataResponseBodyDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyDataListEventInfo self = new QueryDeviceOriginalEventDataResponseBodyDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseBodyDataList extends TeaModel {
        @NameInMap("EventInfo")
        public java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> eventInfo;

        public static QueryDeviceOriginalEventDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyDataList self = new QueryDeviceOriginalEventDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyDataList setEventInfo(java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseBodyData extends TeaModel {
        /**
         * <p>The array of events. Each element represents an event. For more information about the details of the event, see the parameters of the <strong>EventInfo</strong> parameter.</p>
         */
        @NameInMap("List")
        public QueryDeviceOriginalEventDataResponseBodyDataList list;

        /**
         * <p>The identifier of the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>Bo***x44Qx</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <ul>
         * <li><strong>true</strong>: The next page exists.</li>
         * <li><strong>false</strong>: The next page does not exist.</li>
         * </ul>
         * <p>If the value <strong><strong><strong>true</strong> is returned, you can add the value of the <strong>NextPageToken</strong> parameter</strong></strong> to the next request. This allows you to query the data that is not included in the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceOriginalEventDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyData self = new QueryDeviceOriginalEventDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyData setList(QueryDeviceOriginalEventDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalEventDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceOriginalEventDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalEventDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
