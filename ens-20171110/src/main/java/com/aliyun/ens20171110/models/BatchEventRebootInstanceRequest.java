// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRebootInstanceRequest extends TeaModel {
    /**
     * <p>The details of events.</p>
     */
    @NameInMap("EventInfos")
    public java.util.List<BatchEventRebootInstanceRequestEventInfos> eventInfos;

    public static BatchEventRebootInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRebootInstanceRequest self = new BatchEventRebootInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventRebootInstanceRequest setEventInfos(java.util.List<BatchEventRebootInstanceRequestEventInfos> eventInfos) {
        this.eventInfos = eventInfos;
        return this;
    }
    public java.util.List<BatchEventRebootInstanceRequestEventInfos> getEventInfos() {
        return this.eventInfos;
    }

    public static class BatchEventRebootInstanceRequestEventInfos extends TeaModel {
        /**
         * <p>The ID of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-4452cec5a8f8eb9b2879a054207687d6</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The type of the O\&amp;M task.</p>
         * <ul>
         * <li>immediate</li>
         * <li>scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>immediate</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        /**
         * <p>The execution time of the reservation. The timestamp is measured in milliseconds. If the OpsType parameter is set to scheduled, this parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1742452232000</p>
         */
        @NameInMap("PlanTime")
        public Long planTime;

        /**
         * <p>A client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n-54hi3ffi63zrjt4wzx9mepeyh</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventRebootInstanceRequestEventInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchEventRebootInstanceRequestEventInfos self = new BatchEventRebootInstanceRequestEventInfos();
            return TeaModel.build(map, self);
        }

        public BatchEventRebootInstanceRequestEventInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventRebootInstanceRequestEventInfos setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public BatchEventRebootInstanceRequestEventInfos setPlanTime(Long planTime) {
            this.planTime = planTime;
            return this;
        }
        public Long getPlanTime() {
            return this.planTime;
        }

        public BatchEventRebootInstanceRequestEventInfos setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
