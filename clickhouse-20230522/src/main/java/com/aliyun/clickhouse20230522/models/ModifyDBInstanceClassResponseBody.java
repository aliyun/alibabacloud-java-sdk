// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ModifyDBInstanceClassResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassResponseBody self = new ModifyDBInstanceClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassResponseBody setData(ModifyDBInstanceClassResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBInstanceClassResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBInstanceClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBInstanceClassResponseBodyData extends TeaModel {
        @NameInMap("ComputingGroupId")
        public String computingGroupId;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxxxx</p>
         */
        @NameInMap("DBInstanceID")
        public Long DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The maximum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ScaleMax")
        public Long scaleMax;

        /**
         * <p>The minimum capacity for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScaleMin")
        public Long scaleMin;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000****</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static ModifyDBInstanceClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceClassResponseBodyData self = new ModifyDBInstanceClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceClassResponseBodyData setComputingGroupId(String computingGroupId) {
            this.computingGroupId = computingGroupId;
            return this;
        }
        public String getComputingGroupId() {
            return this.computingGroupId;
        }

        public ModifyDBInstanceClassResponseBodyData setDBInstanceID(Long DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Long getDBInstanceID() {
            return this.DBInstanceID;
        }

        public ModifyDBInstanceClassResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyDBInstanceClassResponseBodyData setScaleMax(Long scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Long getScaleMax() {
            return this.scaleMax;
        }

        public ModifyDBInstanceClassResponseBodyData setScaleMin(Long scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Long getScaleMin() {
            return this.scaleMin;
        }

        public ModifyDBInstanceClassResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
