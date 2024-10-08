// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaBackupPlansResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the backup plan.</p>
     */
    @NameInMap("HanaBackupPlans")
    public DescribeHanaBackupPlansResponseBodyHanaBackupPlans hanaBackupPlans;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F029C1C7-26B6-5ADD-A73E-D85CCD7C73A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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
         * 
         * <strong>example:</strong>
         * <p>COMPLETE_DATA_BACKUP</p>
         */
        @NameInMap("BackupPrefix")
        public String backupPrefix;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li>COMPLETE: full backup</li>
         * <li>INCREMENTAL: incremental backup</li>
         * <li>DIFFERENTIAL: differential backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0002scknka*****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEMDB</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>Indicates whether the backup plan is disabled. Valid values:</p>
         * <ul>
         * <li>true: The backup plan is disabled.</li>
         * <li>false: The backup plan is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The ID of the backup plan.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-0000tnyndg3ne5m4ubeu</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the backup plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-20220118-141153</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <ul>
         * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
         * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>I|1602673264|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000csihw82pqkd7hcjws</p>
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
