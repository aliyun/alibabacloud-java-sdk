// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListOperationEventsResponseBody extends TeaModel {
    /**
     * <p>The event list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOperationEventsResponseBodyData> data;

    /**
     * <p>The page number to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationEventsResponseBody self = new ListOperationEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationEventsResponseBody setData(java.util.List<ListOperationEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationEventsResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationEventsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationEventsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOperationEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationEventsResponseBodyDataFollowerInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>hi</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static ListOperationEventsResponseBodyDataFollowerInstances build(java.util.Map<String, ?> map) throws Exception {
            ListOperationEventsResponseBodyDataFollowerInstances self = new ListOperationEventsResponseBodyDataFollowerInstances();
            return TeaModel.build(map, self);
        }

        public ListOperationEventsResponseBodyDataFollowerInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationEventsResponseBodyDataFollowerInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class ListOperationEventsResponseBodyData extends TeaModel {
        /**
         * <p>Specifies whether the event can be canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Cancelable")
        public Boolean cancelable;

        /**
         * <p>Specifies whether the scheduled time for the event can be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChangeScheduleTime")
        public Boolean changeScheduleTime;

        /**
         * <p>The event details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>HOT_UPGRADE</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE_ON_CUSTOMERS_BEHALF</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The follower instance list.</p>
         */
        @NameInMap("FollowerInstances")
        public java.util.List<ListOperationEventsResponseBodyDataFollowerInstances> followerInstances;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1826503661244379138</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>haha</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>21:00-22:00</p>
         */
        @NameInMap("MaintainWindow")
        public String maintainWindow;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpost-cn-sxfsdfsd</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The scheduled time of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22 15:49:28</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The state of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>queued</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListOperationEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationEventsResponseBodyData self = new ListOperationEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationEventsResponseBodyData setCancelable(Boolean cancelable) {
            this.cancelable = cancelable;
            return this;
        }
        public Boolean getCancelable() {
            return this.cancelable;
        }

        public ListOperationEventsResponseBodyData setChangeScheduleTime(Boolean changeScheduleTime) {
            this.changeScheduleTime = changeScheduleTime;
            return this;
        }
        public Boolean getChangeScheduleTime() {
            return this.changeScheduleTime;
        }

        public ListOperationEventsResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListOperationEventsResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListOperationEventsResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListOperationEventsResponseBodyData setFollowerInstances(java.util.List<ListOperationEventsResponseBodyDataFollowerInstances> followerInstances) {
            this.followerInstances = followerInstances;
            return this;
        }
        public java.util.List<ListOperationEventsResponseBodyDataFollowerInstances> getFollowerInstances() {
            return this.followerInstances;
        }

        public ListOperationEventsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListOperationEventsResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListOperationEventsResponseBodyData setMaintainWindow(String maintainWindow) {
            this.maintainWindow = maintainWindow;
            return this;
        }
        public String getMaintainWindow() {
            return this.maintainWindow;
        }

        public ListOperationEventsResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListOperationEventsResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListOperationEventsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListOperationEventsResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
