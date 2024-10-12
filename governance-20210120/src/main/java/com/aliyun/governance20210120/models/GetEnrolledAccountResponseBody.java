// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetEnrolledAccountResponseBody extends TeaModel {
    /**
     * <p>The account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12868156179*****</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The ID of the baseline that is implemented.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1adadfadsf***</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>An array that contains baseline items.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<GetEnrolledAccountResponseBodyBaselineItems> baselineItems;

    /**
     * <p>The time when the account was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-01T02:38:27Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The display name of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The error message.</p>
     * <blockquote>
     * <p> This parameter is returned if the value of <code>Status</code> is <code>Failed</code> or <code>ScheduleFailed</code>.</p>
     * </blockquote>
     */
    @NameInMap("ErrorInfo")
    public GetEnrolledAccountResponseBodyErrorInfo errorInfo;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-5ESoku****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>Indicates whether the initialization is complete. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Initialized")
    public Boolean initialized;

    /**
     * <p>The input parameters that are used when the account was registered.</p>
     */
    @NameInMap("Inputs")
    public GetEnrolledAccountResponseBodyInputs inputs;

    /**
     * <p>The ID of the management account of the resource directory to which the account belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>19534534552*****</p>
     */
    @NameInMap("MasterAccountUid")
    public Long masterAccountUid;

    /**
     * <p>The ID of the settlement account.</p>
     * 
     * <strong>example:</strong>
     * <p>19534534552*****</p>
     */
    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    /**
     * <p>The progress of the applying the baseline to the account.</p>
     */
    @NameInMap("Progress")
    public java.util.List<GetEnrolledAccountResponseBodyProgress> progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>768F908D-A66A-5A5D-816C-20C93CBBFEE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the account. Valid values:</p>
     * <ul>
     * <li>Pending: The account is pending to be created.</li>
     * <li>Running: The account is being created.</li>
     * <li>Finished: The account is created.</li>
     * <li>Failed: The account fails to be created.</li>
     * <li>Scheduling: The account is being scheduled.</li>
     * <li>ScheduleFailed: The account fails to be scheduled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the information about the account was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-01T02:38:27Z</p>
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
        /**
         * <p>The configurations of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Notifications\&quot;:[{\&quot;GroupKey\&quot;:\&quot;account_msg\&quot;,\&quot;Contacts\&quot;:[{\&quot;Name\&quot;:\&quot;aa\&quot;}],\&quot;PmsgStatus\&quot;:1,\&quot;EmailStatus\&quot;:1,\&quot;SmsStatus\&quot;:1}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether baseline item is skipped. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>CompliancePackExists</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The compliance pack already exists.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The recommended solution.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://next.api.aliyun.com/troubleshoot?q=CompliancePackExists%5C%5C%5C%5Cu0026product=Config">https://next.api.aliyun.com/troubleshoot?q=CompliancePackExists\\\\u0026product=Config</a></p>
         */
        @NameInMap("Recommend")
        public String recommend;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D5EAA86-2D41-5CB7-8DA7-B60093ACAA4E</p>
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
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Contacts\&quot;:[{\&quot;Name\&quot;:\&quot;governance\&quot;,\&quot;Email\&quot;:\&quot;wibud****@gmail.com\&quot;,\&quot;Mobile\&quot;:\&quot;1234\&quot;,\&quot;Position\&quot;:\&quot;Other\&quot;}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether baseline item is skipped. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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

    public static class GetEnrolledAccountResponseBodyInputsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetEnrolledAccountResponseBodyInputsTag build(java.util.Map<String, ?> map) throws Exception {
            GetEnrolledAccountResponseBodyInputsTag self = new GetEnrolledAccountResponseBodyInputsTag();
            return TeaModel.build(map, self);
        }

        public GetEnrolledAccountResponseBodyInputsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEnrolledAccountResponseBodyInputsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEnrolledAccountResponseBodyInputs extends TeaModel {
        /**
         * <p>The prefix of the account name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        @NameInMap("AccountNamePrefix")
        public String accountNamePrefix;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12868156179*****</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        /**
         * <p>The baseline items.</p>
         */
        @NameInMap("BaselineItems")
        public java.util.List<GetEnrolledAccountResponseBodyInputsBaselineItems> baselineItems;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-5ESoku****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the settlement account.</p>
         * 
         * <strong>example:</strong>
         * <p>19534534552*****</p>
         */
        @NameInMap("PayerAccountUid")
        public Long payerAccountUid;

        @NameInMap("Tag")
        public java.util.List<GetEnrolledAccountResponseBodyInputsTag> tag;

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

        public GetEnrolledAccountResponseBodyInputs setTag(java.util.List<GetEnrolledAccountResponseBodyInputsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<GetEnrolledAccountResponseBodyInputsTag> getTag() {
            return this.tag;
        }

    }

    public static class GetEnrolledAccountResponseBodyProgress extends TeaModel {
        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of applying the baseline to the account. Valid values:</p>
         * <ul>
         * <li>Pending: The baseline is pending to be applied to the account.</li>
         * <li>Running: The baseline is being applied to the account.</li>
         * <li>Finished: : The baseline is applied to the account.</li>
         * <li>Failed: : The baseline fails to be applied to the account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
