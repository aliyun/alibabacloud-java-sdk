// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryCarProcessEventsResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The call was successful.</li>
     * <li>Other values: An error occurred. For more information, see <a href="https://help.aliyun.com/document_detail/288314.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryCarProcessEventsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified access key is not found.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8B8E77F0-7713-0139-A3D6-93482A025D45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCarProcessEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCarProcessEventsResponseBody self = new QueryCarProcessEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCarProcessEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCarProcessEventsResponseBody setData(QueryCarProcessEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCarProcessEventsResponseBodyData getData() {
        return this.data;
    }

    public QueryCarProcessEventsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCarProcessEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCarProcessEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCarProcessEventsResponseBodyDataPageData extends TeaModel {
        /**
         * <p>The action type of the vehicle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActionType")
        public Integer actionType;

        /**
         * <p>The number of detection boxes recognized by the IPC device.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AreaIndex")
        public Integer areaIndex;

        /**
         * <p>The confidence level of the vehicle recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("Confidence")
        public Integer confidence;

        /**
         * <p>The ID of the intelligent alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>dailyb3d6658d9****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The ID of the intelligent alert event picture.</p>
         * 
         * <strong>example:</strong>
         * <p>SU5LT2pXaUM4MV****Nzg</p>
         */
        @NameInMap("EventPicId")
        public String eventPicId;

        /**
         * <p>The URL of the intelligent alert event picture.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/test.jpg">https://example.com/test.jpg</a></p>
         */
        @NameInMap("EventPicUrl")
        public String eventPicUrl;

        /**
         * <p>The timestamp when the event occurred, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1646288428361</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        /**
         * <p>The type of the intelligent alert event. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: All intelligent alert events.</li>
         * <li>Multiple intelligent alert events: Enter the sequence numbers of the intelligent alert events and separate them with commas (,), such as <code>10001,10002</code>.<blockquote>
         * <p>You can specify up to 10 intelligent alert events at a time.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>To view all intelligent alert event types, go to the <strong>Define Feature</strong> tab of the <strong>Product Details</strong> page in the IoT Platform console. For more information, see <a href="https://help.aliyun.com/document_detail/207701.html">View intelligent alert event types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10005</p>
         */
        @NameInMap("EventType")
        public Integer eventType;

        /**
         * <p>The IotId of the V-series edge appliance.</p>
         * 
         * <strong>example:</strong>
         * <p>gl9kLgp0UsPSCcIM8EAY00****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The license plate number.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheA6****</p>
         */
        @NameInMap("PlateNo")
        public String plateNo;

        /**
         * <p>The DeviceName of the IPC device.</p>
         * 
         * <strong>example:</strong>
         * <p>car_test</p>
         */
        @NameInMap("SubDeviceName")
        public String subDeviceName;

        /**
         * <p>The DeviceNickName of the IPC device.</p>
         * 
         * <strong>example:</strong>
         * <p>TestVehicle</p>
         */
        @NameInMap("SubDeviceNickName")
        public String subDeviceNickName;

        /**
         * <p>The ID of the IPC device.</p>
         * 
         * <strong>example:</strong>
         * <p>ImP6ECd1aQxio9CAfWTO****</p>
         */
        @NameInMap("SubIotId")
        public String subIotId;

        /**
         * <p>The ProductKey of the IPC device.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Duh0F****</p>
         */
        @NameInMap("SubProductKey")
        public String subProductKey;

        /**
         * <p>The task ID of the vehicle detection event.</p>
         * 
         * <strong>example:</strong>
         * <p>daily55617e7653354490938d****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static QueryCarProcessEventsResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryCarProcessEventsResponseBodyDataPageData self = new QueryCarProcessEventsResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryCarProcessEventsResponseBodyDataPageData setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setAreaIndex(Integer areaIndex) {
            this.areaIndex = areaIndex;
            return this;
        }
        public Integer getAreaIndex() {
            return this.areaIndex;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventPicId(String eventPicId) {
            this.eventPicId = eventPicId;
            return this;
        }
        public String getEventPicId() {
            return this.eventPicId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventPicUrl(String eventPicUrl) {
            this.eventPicUrl = eventPicUrl;
            return this;
        }
        public String getEventPicUrl() {
            return this.eventPicUrl;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubDeviceName(String subDeviceName) {
            this.subDeviceName = subDeviceName;
            return this;
        }
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubDeviceNickName(String subDeviceNickName) {
            this.subDeviceNickName = subDeviceNickName;
            return this;
        }
        public String getSubDeviceNickName() {
            return this.subDeviceNickName;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubIotId(String subIotId) {
            this.subIotId = subIotId;
            return this;
        }
        public String getSubIotId() {
            return this.subIotId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubProductKey(String subProductKey) {
            this.subProductKey = subProductKey;
            return this;
        }
        public String getSubProductKey() {
            return this.subProductKey;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryCarProcessEventsResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The list of returned intelligent alert events.</p>
         */
        @NameInMap("PageData")
        public java.util.List<QueryCarProcessEventsResponseBodyDataPageData> pageData;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of vehicle recognition events.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryCarProcessEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCarProcessEventsResponseBodyData self = new QueryCarProcessEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCarProcessEventsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryCarProcessEventsResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryCarProcessEventsResponseBodyData setPageData(java.util.List<QueryCarProcessEventsResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryCarProcessEventsResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryCarProcessEventsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCarProcessEventsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
