// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupPlans")
    public DescribeBackupPlansResponseBodyBackupPlans backupPlans;

    public static DescribeBackupPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlansResponseBody self = new DescribeBackupPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlansResponseBody setBackupPlans(DescribeBackupPlansResponseBodyBackupPlans backupPlans) {
        this.backupPlans = backupPlans;
        return this;
    }
    public DescribeBackupPlansResponseBodyBackupPlans getBackupPlans() {
        return this.backupPlans;
    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlan extends TeaModel {
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

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlan self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlan();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setRetentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Integer getRetentionPeriod() {
            return this.retentionPeriod;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBackupTime(String backupTime) {
            this.backupTime = backupTime;
            return this;
        }
        public String getBackupTime() {
            return this.backupTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlans extends TeaModel {
        @NameInMap("BackupPlan")
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> backupPlan;

        public static DescribeBackupPlansResponseBodyBackupPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlans self = new DescribeBackupPlansResponseBodyBackupPlans();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlans setBackupPlan(java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> backupPlan) {
            this.backupPlan = backupPlan;
            return this;
        }
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> getBackupPlan() {
            return this.backupPlan;
        }

    }

}
