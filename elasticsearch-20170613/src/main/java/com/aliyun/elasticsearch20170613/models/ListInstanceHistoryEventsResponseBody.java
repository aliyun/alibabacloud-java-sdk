// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     */
    @NameInMap("Headers")
    public ListInstanceHistoryEventsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1A6830A-F59B-4E05-BFAC-9496C21DBBA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
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
        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        /**
         * <p>The total number of failures.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("X-Total-Failed")
        public Long xTotalFailed;

        /**
         * <p>The total number of successes.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
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
        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze8s9cjdf2cv969****</p>
         */
        @NameInMap("ecsId")
        public String ecsId;

        /**
         * <p>The event creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventCreateTime")
        public String eventCreateTime;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li>FAILED: failed</li>
         * <li>EXECUTED: executed</li>
         * <li>EXECUTING: executing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTED</p>
         */
        @NameInMap("eventCycleStatus")
        public String eventCycleStatus;

        /**
         * <p>The event execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventExecuteTime")
        public String eventExecuteTime;

        /**
         * <p>The event completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventFinashTime")
        public String eventFinashTime;

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li>INFO: information</li>
         * <li>WARN: warning</li>
         * <li>CRITICAL: critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("eventLevel")
        public String eventLevel;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>ECS:AUTO_RESTART: Automatic restart of an ECS node.</li>
         * <li>Instance:InstanceFailure.Reboot:Executed: ECS instance reboot completed (instance error).</li>
         * <li>Instance:InstanceFailure.Reboot:Executing: ECS instance reboot started (instance error).</li>
         * <li>Instance:SystemFailure.Reboot:Executed: ECS instance reboot completed (system error).</li>
         * <li>Instance:SystemFailure.Reboot:Executing: ECS instance reboot started (system error).</li>
         * <li>Instance:SystemFailure.Reboot:Failed: ECS instance reboot failed (system error).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS:AUTO_RESTART</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-2r42l7a740005****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The IP address of the node that generated the event.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.xx.xx</p>
         */
        @NameInMap("nodeIP")
        public String nodeIP;

        /**
         * <p>The region ID where the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static ListInstanceHistoryEventsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryEventsResponseBodyResult self = new ListInstanceHistoryEventsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryEventsResponseBodyResult setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
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
