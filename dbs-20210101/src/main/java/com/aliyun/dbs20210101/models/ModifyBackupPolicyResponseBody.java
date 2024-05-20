// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyBackupPolicyResponseBodyData data;

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

    public static ModifyBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponseBody self = new ModifyBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBackupPolicyResponseBody setData(ModifyBackupPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyBackupPolicyResponseBodyData getData() {
        return this.data;
    }

    public ModifyBackupPolicyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyBackupPolicyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyBackupPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyBackupPolicyResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies extends TeaModel {
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

        public static ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies self = new ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setAutoCreated(Boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }
        public Boolean getAutoCreated() {
            return this.autoCreated;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setBakType(String bakType) {
            this.bakType = bakType;
            return this;
        }
        public String getBakType() {
            return this.bakType;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setDumpAction(String dumpAction) {
            this.dumpAction = dumpAction;
            return this;
        }
        public String getDumpAction() {
            return this.dumpAction;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
            return this.retentionValue;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

    public static class ModifyBackupPolicyResponseBodyData extends TeaModel {
        @NameInMap("AdvanceDataPolicies")
        public java.util.List<ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies> advanceDataPolicies;

        @NameInMap("PreferredBackupWindow")
        public String preferredBackupWindow;

        @NameInMap("PreferredBackupWindowBegin")
        public String preferredBackupWindowBegin;

        public static ModifyBackupPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyResponseBodyData self = new ModifyBackupPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyResponseBodyData setAdvanceDataPolicies(java.util.List<ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies> advanceDataPolicies) {
            this.advanceDataPolicies = advanceDataPolicies;
            return this;
        }
        public java.util.List<ModifyBackupPolicyResponseBodyDataAdvanceDataPolicies> getAdvanceDataPolicies() {
            return this.advanceDataPolicies;
        }

        public ModifyBackupPolicyResponseBodyData setPreferredBackupWindow(String preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }
        public String getPreferredBackupWindow() {
            return this.preferredBackupWindow;
        }

        public ModifyBackupPolicyResponseBodyData setPreferredBackupWindowBegin(String preferredBackupWindowBegin) {
            this.preferredBackupWindowBegin = preferredBackupWindowBegin;
            return this;
        }
        public String getPreferredBackupWindowBegin() {
            return this.preferredBackupWindowBegin;
        }

    }

}
