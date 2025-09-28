// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRedeployInstanceRequest extends TeaModel {
    @NameInMap("EventInfos")
    public java.util.List<BatchEventRedeployInstanceRequestEventInfos> eventInfos;

    public static BatchEventRedeployInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRedeployInstanceRequest self = new BatchEventRedeployInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventRedeployInstanceRequest setEventInfos(java.util.List<BatchEventRedeployInstanceRequestEventInfos> eventInfos) {
        this.eventInfos = eventInfos;
        return this;
    }
    public java.util.List<BatchEventRedeployInstanceRequestEventInfos> getEventInfos() {
        return this.eventInfos;
    }

    public static class BatchEventRedeployInstanceRequestEventInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>1742452232000</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        /**
         * <strong>example:</strong>
         * <p>immediate</p>
         */
        @NameInMap("PlanTime")
        public Long planTime;

        /**
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventRedeployInstanceRequestEventInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchEventRedeployInstanceRequestEventInfos self = new BatchEventRedeployInstanceRequestEventInfos();
            return TeaModel.build(map, self);
        }

        public BatchEventRedeployInstanceRequestEventInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventRedeployInstanceRequestEventInfos setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public BatchEventRedeployInstanceRequestEventInfos setPlanTime(Long planTime) {
            this.planTime = planTime;
            return this;
        }
        public Long getPlanTime() {
            return this.planTime;
        }

        public BatchEventRedeployInstanceRequestEventInfos setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
