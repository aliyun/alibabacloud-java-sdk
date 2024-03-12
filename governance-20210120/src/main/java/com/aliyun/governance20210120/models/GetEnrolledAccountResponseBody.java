// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetEnrolledAccountResponseBody extends TeaModel {
    /**
     * <p>The account ID.</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The ID of the baseline that was applied to the account.</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    @NameInMap("BaselineItems")
    public java.util.List<GetEnrolledAccountResponseBodyBaselineItems> baselineItems;

    /**
     * <p>The time at which the account was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The display name of the account.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorInfo")
    public GetEnrolledAccountResponseBodyErrorInfo errorInfo;

    /**
     * <p>The ID of the parent folder.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>Indicates whether the account was initialized.</p>
     */
    @NameInMap("Initialized")
    public Boolean initialized;

    /**
     * <p>The input parameters that are used when you enrolled the account.</p>
     */
    @NameInMap("Inputs")
    public GetEnrolledAccountResponseBodyInputs inputs;

    /**
     * <p>The ID of the master account to which the account belongs.</p>
     */
    @NameInMap("MasterAccountUid")
    public Long masterAccountUid;

    /**
     * <p>The ID of the billing account.</p>
     */
    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    /**
     * <p>The progress of applying the account baseline to the account.</p>
     */
    @NameInMap("Progress")
    public java.util.List<GetEnrolledAccountResponseBodyProgress> progress;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The creation status of the account. Valid values:</p>
     * <br>
     * <p>*   Pending: The account is waiting to be created.</p>
     * <p>*   Running: The account is being created.</p>
     * <p>*   Finished: The account is created.</p>
     * <p>*   Failed: The account failed to be created.</p>
     * <p>*   Scheduling: The account is being scheduled.</p>
     * <p>*   ScheduleFailed: The account failed to be scheduled.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the information about the account was updated.</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetEnrolledAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnrolledAccountResponseBody self = new GetEnrolledAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnrolledAccountResponseBody setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public GetEnrolledAccountResponseBody setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public GetEnrolledAccountResponseBody setBaselineItems(java.util.List<GetEnrolledAccountResponseBodyBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<GetEnrolledAccountResponseBodyBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public GetEnrolledAccountResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEnrolledAccountResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetEnrolledAccountResponseBody setErrorInfo(GetEnrolledAccountResponseBodyErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public GetEnrolledAccountResponseBodyErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public GetEnrolledAccountResponseBody setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetEnrolledAccountResponseBody setInitialized(Boolean initialized) {
        this.initialized = initialized;
        return this;
    }
    public Boolean getInitialized() {
        return this.initialized;
    }

    public GetEnrolledAccountResponseBody setInputs(GetEnrolledAccountResponseBodyInputs inputs) {
        this.inputs = inputs;
        return this;
    }
    public GetEnrolledAccountResponseBodyInputs getInputs() {
        return this.inputs;
    }

    public GetEnrolledAccountResponseBody setMasterAccountUid(Long masterAccountUid) {
        this.masterAccountUid = masterAccountUid;
        return this;
    }
    public Long getMasterAccountUid() {
        return this.masterAccountUid;
    }

    public GetEnrolledAccountResponseBody setPayerAccountUid(Long payerAccountUid) {
        this.payerAccountUid = payerAccountUid;
        return this;
    }
    public Long getPayerAccountUid() {
        return this.payerAccountUid;
    }

    public GetEnrolledAccountResponseBody setProgress(java.util.List<GetEnrolledAccountResponseBodyProgress> progress) {
        this.progress = progress;
        return this;
    }
    public java.util.List<GetEnrolledAccountResponseBodyProgress> getProgress() {
        return this.progress;
    }

    public GetEnrolledAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnrolledAccountResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEnrolledAccountResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetEnrolledAccountResponseBodyBaselineItems extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Name")
        public String name;

        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("Version")
        public String version;

        public static GetEnrolledAccountResponseBodyBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyBaselineItems self = new GetEnrolledAccountResponseBodyBaselineItems();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetEnrolledAccountResponseBodyBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnrolledAccountResponseBodyBaselineItems setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public GetEnrolledAccountResponseBodyBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetEnrolledAccountResponseBodyErrorInfo extends TeaModel {
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The suggestions that are used to resolve the issue.</p>
         */
        @NameInMap("Recommend")
        public String recommend;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static GetEnrolledAccountResponseBodyErrorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyErrorInfo self = new GetEnrolledAccountResponseBodyErrorInfo();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyErrorInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetEnrolledAccountResponseBodyErrorInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetEnrolledAccountResponseBodyErrorInfo setRecommend(String recommend) {
            this.recommend = recommend;
            return this;
        }
        public String getRecommend() {
            return this.recommend;
        }

        public GetEnrolledAccountResponseBodyErrorInfo setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetEnrolledAccountResponseBodyInputsBaselineItems extends TeaModel {
        /**
         * <p>The configurations of the baseline item.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether to skip the baseline item.</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetEnrolledAccountResponseBodyInputsBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyInputsBaselineItems self = new GetEnrolledAccountResponseBodyInputsBaselineItems();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyInputsBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetEnrolledAccountResponseBodyInputsBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnrolledAccountResponseBodyInputsBaselineItems setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public GetEnrolledAccountResponseBodyInputsBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetEnrolledAccountResponseBodyInputs extends TeaModel {
        /**
         * <p>The prefix for the account name of the member.</p>
         */
        @NameInMap("AccountNamePrefix")
        public String accountNamePrefix;

        /**
         * <p>The account ID.</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        /**
         * <p>An array that contains baseline items.</p>
         */
        @NameInMap("BaselineItems")
        public java.util.List<GetEnrolledAccountResponseBodyInputsBaselineItems> baselineItems;

        /**
         * <p>The display name of the account.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the parent folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the billing account.</p>
         */
        @NameInMap("PayerAccountUid")
        public Long payerAccountUid;

        public static GetEnrolledAccountResponseBodyInputs build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyInputs self = new GetEnrolledAccountResponseBodyInputs();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyInputs setAccountNamePrefix(String accountNamePrefix) {
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }
        public String getAccountNamePrefix() {
            return this.accountNamePrefix;
        }

        public GetEnrolledAccountResponseBodyInputs setAccountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }
        public Long getAccountUid() {
            return this.accountUid;
        }

        public GetEnrolledAccountResponseBodyInputs setBaselineItems(java.util.List<GetEnrolledAccountResponseBodyInputsBaselineItems> baselineItems) {
            this.baselineItems = baselineItems;
            return this;
        }
        public java.util.List<GetEnrolledAccountResponseBodyInputsBaselineItems> getBaselineItems() {
            return this.baselineItems;
        }

        public GetEnrolledAccountResponseBodyInputs setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEnrolledAccountResponseBodyInputs setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetEnrolledAccountResponseBodyInputs setPayerAccountUid(Long payerAccountUid) {
            this.payerAccountUid = payerAccountUid;
            return this;
        }
        public Long getPayerAccountUid() {
            return this.payerAccountUid;
        }

    }

    public static class GetEnrolledAccountResponseBodyProgress extends TeaModel {
        /**
         * <p>The name of the baseline item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of applying the account baseline to the account. Valid values:</p>
         * <br>
         * <p>*   Pending: The account is waiting to be created.</p>
         * <p>*   Running: The account baseline is being applied to the account.</p>
         * <p>*   Finished: The account baseline is applied to the account.</p>
         * <p>*   Failed: The account baseline failed to be applied to the account.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetEnrolledAccountResponseBodyProgress build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyProgress self = new GetEnrolledAccountResponseBodyProgress();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyProgress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnrolledAccountResponseBodyProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
