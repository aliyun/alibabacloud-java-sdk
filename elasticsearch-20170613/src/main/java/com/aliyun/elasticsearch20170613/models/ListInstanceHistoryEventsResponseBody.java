// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListInstanceHistoryEventsResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>D1A6830A-F59B-4E05-BFAC-9496C21DBBA7</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("X-Total-Failed")
        public Long xTotalFailed;

        /**
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
         * <strong>example:</strong>
         * <p>i-2ze8s9cjdf2cv969****</p>
         */
        @NameInMap("ecsId")
        public String ecsId;

        /**
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventCreateTime")
        public String eventCreateTime;

        /**
         * <strong>example:</strong>
         * <p>EXECUTED</p>
         */
        @NameInMap("eventCycleStatus")
        public String eventCycleStatus;

        /**
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventExecuteTime")
        public String eventExecuteTime;

        /**
         * <strong>example:</strong>
         * <p>2017-12-07T00:00:00Z</p>
         */
        @NameInMap("eventFinashTime")
        public String eventFinashTime;

        /**
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("eventLevel")
        public String eventLevel;

        /**
         * <strong>example:</strong>
         * <p>ECS:AUTO_RESTART</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>es-cn-2r42l7a740005****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>10.1.xx.xx</p>
         */
        @NameInMap("nodeIP")
        public String nodeIP;

        /**
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
