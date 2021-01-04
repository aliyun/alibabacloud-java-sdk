// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupPlan")
    public DescribeBackupPlanResponseBodyBackupPlan backupPlan;

    public static DescribeBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanResponseBody self = new DescribeBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlanResponseBody setBackupPlan(DescribeBackupPlanResponseBodyBackupPlan backupPlan) {
        this.backupPlan = backupPlan;
        return this;
    }
    public DescribeBackupPlanResponseBodyBackupPlan getBackupPlan() {
        return this.backupPlan;
    }

    public static class DescribeBackupPlanResponseBodyBackupPlan extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("BackupPeriod")
        public String backupPeriod;

        @NameInMap("RetentionPeriod")
        public Integer retentionPeriod;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("BackupTime")
        public String backupTime;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        public static DescribeBackupPlanResponseBodyBackupPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanResponseBodyBackupPlan self = new DescribeBackupPlanResponseBodyBackupPlan();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanResponseBodyBackupPlan setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setBackupTime(String backupTime) {
            this.backupTime = backupTime;
            return this;
        }
        public String getBackupTime() {
            return this.backupTime;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBackupPlanResponseBodyBackupPlan setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

}
