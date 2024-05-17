// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeBackupPolicyResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBackupPolicyResponseBody setData(DescribeBackupPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupPolicyResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupPolicyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupPolicyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies extends TeaModel {
        @NameInMap("AutoCreated")
        public Boolean autoCreated;

        @NameInMap("BakType")
        public String bakType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("DumpAction")
        public String dumpAction;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("RetentionType")
        public String retentionType;

        @NameInMap("RetentionValue")
        public String retentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies self = new DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setAutoCreated(Boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }
        public Boolean getAutoCreated() {
            return this.autoCreated;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setDumpAction(String dumpAction) {
            this.dumpAction = dumpAction;
            return this;
        }
        public String getDumpAction() {
            return this.dumpAction;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
            return this.retentionValue;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies extends TeaModel {
        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EnableLogBackup")
        public Boolean enableLogBackup;

        @NameInMap("LogRetentionType")
        public String logRetentionType;

        @NameInMap("LogRetentionValue")
        public String logRetentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StrategyId")
        public String strategyId;

        public static DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies self = new DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setEnableLogBackup(Boolean enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Boolean getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setLogRetentionValue(String logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

        public DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class DescribeBackupPolicyResponseBodyData extends TeaModel {
        @NameInMap("AdvanceDataPolicies")
        public java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies> advanceDataPolicies;

        @NameInMap("AdvanceLogPolicies")
        public java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies> advanceLogPolicies;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupPriority")
        public Integer backupPriority;

        @NameInMap("BackupRetentionPeriod")
        public Integer backupRetentionPeriod;

        @NameInMap("BackupRetentionPolicyOnClusterDeletion")
        public String backupRetentionPolicyOnClusterDeletion;

        @NameInMap("Category")
        public String category;

        @NameInMap("EnableBackup")
        public Integer enableBackup;

        @NameInMap("EnableIncBackup")
        public Integer enableIncBackup;

        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        @NameInMap("HighFrequencyBakInterval")
        public Integer highFrequencyBakInterval;

        @NameInMap("HighSpaceUsageProtection")
        public String highSpaceUsageProtection;

        @NameInMap("IncBackupInterval")
        public Integer incBackupInterval;

        @NameInMap("LocalLogRetentionSpace")
        public Integer localLogRetentionSpace;

        @NameInMap("LogBackupLocalRetentionNumber")
        public String logBackupLocalRetentionNumber;

        @NameInMap("LogBackupRetention")
        public Integer logBackupRetention;

        @NameInMap("PreferredBackupDate")
        public String preferredBackupDate;

        @NameInMap("PreferredBackupWindow")
        public String preferredBackupWindow;

        @NameInMap("PreferredBackupWindowBegin")
        public String preferredBackupWindowBegin;

        public static DescribeBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPolicyResponseBodyData self = new DescribeBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPolicyResponseBodyData setAdvanceDataPolicies(java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies> advanceDataPolicies) {
            this.advanceDataPolicies = advanceDataPolicies;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceDataPolicies> getAdvanceDataPolicies() {
            return this.advanceDataPolicies;
        }

        public DescribeBackupPolicyResponseBodyData setAdvanceLogPolicies(java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies> advanceLogPolicies) {
            this.advanceLogPolicies = advanceLogPolicies;
            return this;
        }
        public java.util.List<DescribeBackupPolicyResponseBodyDataAdvanceLogPolicies> getAdvanceLogPolicies() {
            return this.advanceLogPolicies;
        }

        public DescribeBackupPolicyResponseBodyData setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupPolicyResponseBodyData setBackupPriority(Integer backupPriority) {
            this.backupPriority = backupPriority;
            return this;
        }
        public Integer getBackupPriority() {
            return this.backupPriority;
        }

        public DescribeBackupPolicyResponseBodyData setBackupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPolicyResponseBodyData setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }
        public String getBackupRetentionPolicyOnClusterDeletion() {
            return this.backupRetentionPolicyOnClusterDeletion;
        }

        public DescribeBackupPolicyResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeBackupPolicyResponseBodyData setEnableBackup(Integer enableBackup) {
            this.enableBackup = enableBackup;
            return this;
        }
        public Integer getEnableBackup() {
            return this.enableBackup;
        }

        public DescribeBackupPolicyResponseBodyData setEnableIncBackup(Integer enableIncBackup) {
            this.enableIncBackup = enableIncBackup;
            return this;
        }
        public Integer getEnableIncBackup() {
            return this.enableIncBackup;
        }

        public DescribeBackupPolicyResponseBodyData setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeBackupPolicyResponseBodyData setHighFrequencyBakInterval(Integer highFrequencyBakInterval) {
            this.highFrequencyBakInterval = highFrequencyBakInterval;
            return this;
        }
        public Integer getHighFrequencyBakInterval() {
            return this.highFrequencyBakInterval;
        }

        public DescribeBackupPolicyResponseBodyData setHighSpaceUsageProtection(String highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }
        public String getHighSpaceUsageProtection() {
            return this.highSpaceUsageProtection;
        }

        public DescribeBackupPolicyResponseBodyData setIncBackupInterval(Integer incBackupInterval) {
            this.incBackupInterval = incBackupInterval;
            return this;
        }
        public Integer getIncBackupInterval() {
            return this.incBackupInterval;
        }

        public DescribeBackupPolicyResponseBodyData setLocalLogRetentionSpace(Integer localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }
        public Integer getLocalLogRetentionSpace() {
            return this.localLogRetentionSpace;
        }

        public DescribeBackupPolicyResponseBodyData setLogBackupLocalRetentionNumber(String logBackupLocalRetentionNumber) {
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }
        public String getLogBackupLocalRetentionNumber() {
            return this.logBackupLocalRetentionNumber;
        }

        public DescribeBackupPolicyResponseBodyData setLogBackupRetention(Integer logBackupRetention) {
            this.logBackupRetention = logBackupRetention;
            return this;
        }
        public Integer getLogBackupRetention() {
            return this.logBackupRetention;
        }

        public DescribeBackupPolicyResponseBodyData setPreferredBackupDate(String preferredBackupDate) {
            this.preferredBackupDate = preferredBackupDate;
            return this;
        }
        public String getPreferredBackupDate() {
            return this.preferredBackupDate;
        }

        public DescribeBackupPolicyResponseBodyData setPreferredBackupWindow(String preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }
        public String getPreferredBackupWindow() {
            return this.preferredBackupWindow;
        }

        public DescribeBackupPolicyResponseBodyData setPreferredBackupWindowBegin(String preferredBackupWindowBegin) {
            this.preferredBackupWindowBegin = preferredBackupWindowBegin;
            return this;
        }
        public String getPreferredBackupWindowBegin() {
            return this.preferredBackupWindowBegin;
        }

    }

}
