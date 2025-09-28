// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventMigrateInstanceRequest extends TeaModel {
    @NameInMap("EventInfos")
    public java.util.List<BatchEventMigrateInstanceRequestEventInfos> eventInfos;

    public static BatchEventMigrateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventMigrateInstanceRequest self = new BatchEventMigrateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventMigrateInstanceRequest setEventInfos(java.util.List<BatchEventMigrateInstanceRequestEventInfos> eventInfos) {
        this.eventInfos = eventInfos;
        return this;
    }
    public java.util.List<BatchEventMigrateInstanceRequestEventInfos> getEventInfos() {
        return this.eventInfos;
    }

    public static class BatchEventMigrateInstanceRequestEventInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abandon</p>
         */
        @NameInMap("DataPolicy")
        public String dataPolicy;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immediate</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>1742452232000</p>
         */
        @NameInMap("PlanTime")
        public Long planTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventMigrateInstanceRequestEventInfos build(java.util.Map<String, ?> map) throws Exception {
            BatchEventMigrateInstanceRequestEventInfos self = new BatchEventMigrateInstanceRequestEventInfos();
            return TeaModel.build(map, self);
        }

        public BatchEventMigrateInstanceRequestEventInfos setDataPolicy(String dataPolicy) {
            this.dataPolicy = dataPolicy;
            return this;
        }
        public String getDataPolicy() {
            return this.dataPolicy;
        }

        public BatchEventMigrateInstanceRequestEventInfos setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventMigrateInstanceRequestEventInfos setOpsType(String opsType) {
            this.opsType = opsType;
            return this;
        }
        public String getOpsType() {
            return this.opsType;
        }

        public BatchEventMigrateInstanceRequestEventInfos setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public BatchEventMigrateInstanceRequestEventInfos setPlanTime(Long planTime) {
            this.planTime = planTime;
            return this;
        }
        public Long getPlanTime() {
            return this.planTime;
        }

        public BatchEventMigrateInstanceRequestEventInfos setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
