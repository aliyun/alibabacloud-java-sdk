// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDBInstanceClassResponseBodyData data;

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
        @NameInMap("DBInstanceID")
        public Long DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("ScaleMax")
        public Long scaleMax;

        @NameInMap("ScaleMin")
        public Long scaleMin;

        @NameInMap("TaskId")
        public Long taskId;

        public static ModifyDBInstanceClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceClassResponseBodyData self = new ModifyDBInstanceClassResponseBodyData();
            return TeaModel.build(map, self);
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
