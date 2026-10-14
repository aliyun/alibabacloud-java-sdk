// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventMigrateInstanceRequest extends TeaModel {
    /**
     * <p>The list of events.</p>
     */
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
         * <p>The data migration policy. Valid values:</p>
         * <ul>
         * <li>abandon: Does not migrate data. This is the default value.</li>
         * <li>force_transfer: Performs forcible migration of EPS resource data.</li>
         * <li>try_transfer: Migrates data on a best-effort basis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abandon</p>
         */
        @NameInMap("DataPolicy")
        public String dataPolicy;

        /**
         * <p>The event ID, in the format of e-*.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The O&amp;M task type. Valid values:</p>
         * <ul>
         * <li>immediate: immediate execution.</li>
         * <li>scheduled: scheduled execution.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immediate</p>
         */
        @NameInMap("OpsType")
        public String opsType;

        /**
         * <p>The instance password. This parameter is optional. If you do not specify this parameter, a random password is used.</p>
         * <p>The password must be 8 to 30 characters in length and must contain uppercase letters, lowercase letters, and digits.</p>
         * <p>Note: Password specification is not supported for scheduled execution.</p>
         * 
         * <strong>example:</strong>
         * <p>AAaa1234</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The scheduled execution time. The value is a timestamp in milliseconds.
         * This parameter is required when OpsType is set to scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1742452232000</p>
         */
        @NameInMap("PlanTime")
        public Long planTime;

        @NameInMap("PlanUtcTime")
        public String planUtcTime;

        /**
         * <p>The resource ID, in the format of i-*.</p>
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

        public BatchEventMigrateInstanceRequestEventInfos setPlanUtcTime(String planUtcTime) {
            this.planUtcTime = planUtcTime;
            return this;
        }
        public String getPlanUtcTime() {
            return this.planUtcTime;
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
