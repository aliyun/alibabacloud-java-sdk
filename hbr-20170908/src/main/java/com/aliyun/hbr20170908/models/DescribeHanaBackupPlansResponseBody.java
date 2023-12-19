// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupPlansResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the backup plan.</p>
     */
    @NameInMap("HanaBackupPlans")
    public DescribeHanaBackupPlansResponseBodyHanaBackupPlans hanaBackupPlans;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHanaBackupPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaBackupPlansResponseBody self = new DescribeHanaBackupPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaBackupPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaBackupPlansResponseBody setHanaBackupPlans(DescribeHanaBackupPlansResponseBodyHanaBackupPlans hanaBackupPlans) {
        this.hanaBackupPlans = hanaBackupPlans;
        return this;
    }
    public DescribeHanaBackupPlansResponseBodyHanaBackupPlans getHanaBackupPlans() {
        return this.hanaBackupPlans;
    }

    public DescribeHanaBackupPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaBackupPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaBackupPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaBackupPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaBackupPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHanaBackupPlansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan extends TeaModel {
        /**
         * <p>The backup prefix.</p>
         */
        @NameInMap("BackupPrefix")
        public String backupPrefix;

        /**
         * <p>The backup type. Valid values:</p>
         * <br>
         * <p>*   COMPLETE: full backup</p>
         * <p>*   INCREMENTAL: incremental backup</p>
         * <p>*   DIFFERENTIAL: differential backup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>Indicates whether the backup plan is disabled. Valid values:</p>
         * <br>
         * <p>*   true: The backup plan is disabled.</p>
         * <p>*   false: The backup plan is enabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The ID of the backup plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the backup plan.</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>*   startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</p>
         * <p>*   interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The ID of the backup vault.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan self = new DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan();
            return TeaModel.build(map, self);
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setBackupPrefix(String backupPrefix) {
            this.backupPrefix = backupPrefix;
            return this;
        }
        public String getBackupPrefix() {
            return this.backupPrefix;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeHanaBackupPlansResponseBodyHanaBackupPlans extends TeaModel {
        @NameInMap("HanaBackupPlan")
        public java.util.List<DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan> hanaBackupPlan;

        public static DescribeHanaBackupPlansResponseBodyHanaBackupPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaBackupPlansResponseBodyHanaBackupPlans self = new DescribeHanaBackupPlansResponseBodyHanaBackupPlans();
            return TeaModel.build(map, self);
        }

        public DescribeHanaBackupPlansResponseBodyHanaBackupPlans setHanaBackupPlan(java.util.List<DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan> hanaBackupPlan) {
            this.hanaBackupPlan = hanaBackupPlan;
            return this;
        }
        public java.util.List<DescribeHanaBackupPlansResponseBodyHanaBackupPlansHanaBackupPlan> getHanaBackupPlan() {
            return this.hanaBackupPlan;
        }

    }

}
