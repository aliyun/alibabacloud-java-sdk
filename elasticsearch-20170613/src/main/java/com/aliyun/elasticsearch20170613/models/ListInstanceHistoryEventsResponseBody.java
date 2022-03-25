// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListInstanceHistoryEventsResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListInstanceHistoryEventsResponseBodyResult> result;

    public static ListInstanceHistoryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryEventsResponseBody self = new ListInstanceHistoryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryEventsResponseBody setHeaders(ListInstanceHistoryEventsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListInstanceHistoryEventsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListInstanceHistoryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceHistoryEventsResponseBody setResult(java.util.List<ListInstanceHistoryEventsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceHistoryEventsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceHistoryEventsResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        @NameInMap("X-Total-Failed")
        public Long xTotalFailed;

        @NameInMap("X-Total-Success")
        public Long xTotalSuccess;

        public static ListInstanceHistoryEventsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryEventsResponseBodyHeaders self = new ListInstanceHistoryEventsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryEventsResponseBodyHeaders setXTotalCount(Long xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

        public ListInstanceHistoryEventsResponseBodyHeaders setXTotalFailed(Long xTotalFailed) {
            this.xTotalFailed = xTotalFailed;
            return this;
        }
        public Long getXTotalFailed() {
            return this.xTotalFailed;
        }

        public ListInstanceHistoryEventsResponseBodyHeaders setXTotalSuccess(Long xTotalSuccess) {
            this.xTotalSuccess = xTotalSuccess;
            return this;
        }
        public Long getXTotalSuccess() {
            return this.xTotalSuccess;
        }

    }

    public static class ListInstanceHistoryEventsResponseBodyResult extends TeaModel {
        @NameInMap("actionList")
        public java.util.List<String> actionList;

        @NameInMap("eventCreateTime")
        public String eventCreateTime;

        @NameInMap("eventCycleStatus")
        public String eventCycleStatus;

        @NameInMap("eventExecuteTime")
        public String eventExecuteTime;

        @NameInMap("eventFinashTime")
        public String eventFinashTime;

        @NameInMap("eventLevel")
        public String eventLevel;

        @NameInMap("eventType")
        public String eventType;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("nodeIP")
        public String nodeIP;

        @NameInMap("regionId")
        public String regionId;

        public static ListInstanceHistoryEventsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryEventsResponseBodyResult self = new ListInstanceHistoryEventsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryEventsResponseBodyResult setActionList(java.util.List<String> actionList) {
            this.actionList = actionList;
            return this;
        }
        public java.util.List<String> getActionList() {
            return this.actionList;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventCreateTime(String eventCreateTime) {
            this.eventCreateTime = eventCreateTime;
            return this;
        }
        public String getEventCreateTime() {
            return this.eventCreateTime;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventCycleStatus(String eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public String getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventExecuteTime(String eventExecuteTime) {
            this.eventExecuteTime = eventExecuteTime;
            return this;
        }
        public String getEventExecuteTime() {
            return this.eventExecuteTime;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventFinashTime(String eventFinashTime) {
            this.eventFinashTime = eventFinashTime;
            return this;
        }
        public String getEventFinashTime() {
            return this.eventFinashTime;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public ListInstanceHistoryEventsResponseBodyResult setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListInstanceHistoryEventsResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceHistoryEventsResponseBodyResult setNodeIP(String nodeIP) {
            this.nodeIP = nodeIP;
            return this;
        }
        public String getNodeIP() {
            return this.nodeIP;
        }

        public ListInstanceHistoryEventsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
