// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetEnrolledAccountResponseBody extends TeaModel {
    // 账号ID
    @NameInMap("AccountUid")
    public Long accountUid;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 账号显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 错误信息
    @NameInMap("ErrorInfo")
    public GetEnrolledAccountResponseBodyErrorInfo errorInfo;

    // 父资源夹ID
    @NameInMap("FolderId")
    public String folderId;

    // 是否初始化完成
    @NameInMap("Initialized")
    public Boolean initialized;

    // 注册账号时的输入参数
    @NameInMap("Inputs")
    public GetEnrolledAccountResponseBodyInputs inputs;

    // 所属的Master账号ID
    @NameInMap("MasterAccountUid")
    public Long masterAccountUid;

    // 结算账号ID
    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    // 基线实施进度
    @NameInMap("Progress")
    public java.util.List<GetEnrolledAccountResponseBodyProgress> progress;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 账号注册状态
    @NameInMap("Status")
    public String status;

    // 更新时间
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

    public static class GetEnrolledAccountResponseBodyErrorInfo extends TeaModel {
        // 错误码
        @NameInMap("Code")
        public String code;

        // 错误信息
        @NameInMap("Message")
        public String message;

        // 错误处理建议
        @NameInMap("Recommend")
        public String recommend;

        // 请求ID
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
        // 基线项配置
        @NameInMap("Config")
        public String config;

        // 基线项名称
        @NameInMap("Name")
        public String name;

        // 是否跳过基线项
        @NameInMap("Skip")
        public Boolean skip;

        // 基线项版本
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
        // 账号名称前缀
        @NameInMap("AccountNamePrefix")
        public String accountNamePrefix;

        // 账号ID
        @NameInMap("AccountUid")
        public Long accountUid;

        // 基线项配置数组
        @NameInMap("BaselineItems")
        public java.util.List<GetEnrolledAccountResponseBodyInputsBaselineItems> baselineItems;

        // 账号展示名称
        @NameInMap("DisplayName")
        public String displayName;

        // 父资源夹ID
        @NameInMap("FolderId")
        public String folderId;

        // 结算账号ID
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
        // 基线项名称
        @NameInMap("Name")
        public String name;

        // 基线项实施状态
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
