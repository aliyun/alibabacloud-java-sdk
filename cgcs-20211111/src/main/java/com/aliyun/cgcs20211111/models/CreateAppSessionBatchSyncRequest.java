// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchSyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppInfos")
    public java.util.List<CreateAppSessionBatchSyncRequestAppInfos> appInfos;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    public static CreateAppSessionBatchSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchSyncRequest self = new CreateAppSessionBatchSyncRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchSyncRequest setAppInfos(java.util.List<CreateAppSessionBatchSyncRequestAppInfos> appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public java.util.List<CreateAppSessionBatchSyncRequestAppInfos> getAppInfos() {
        return this.appInfos;
    }

    public CreateAppSessionBatchSyncRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public static class CreateAppSessionBatchSyncRequestAppInfosMatchRules extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateAppSessionBatchSyncRequestAppInfosMatchRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncRequestAppInfosMatchRules self = new CreateAppSessionBatchSyncRequestAppInfosMatchRules();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncRequestAppInfosMatchRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchSyncRequestAppInfosMatchRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAppSessionBatchSyncRequestAppInfosMatchRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateAppSessionBatchSyncRequestAppInfosStartParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionBatchSyncRequestAppInfosStartParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncRequestAppInfosStartParameters self = new CreateAppSessionBatchSyncRequestAppInfosStartParameters();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncRequestAppInfosStartParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchSyncRequestAppInfosStartParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionBatchSyncRequestAppInfosSystemInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionBatchSyncRequestAppInfosSystemInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncRequestAppInfosSystemInfo self = new CreateAppSessionBatchSyncRequestAppInfosSystemInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncRequestAppInfosSystemInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchSyncRequestAppInfosSystemInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionBatchSyncRequestAppInfosTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAppSessionBatchSyncRequestAppInfosTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncRequestAppInfosTags self = new CreateAppSessionBatchSyncRequestAppInfosTags();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncRequestAppInfosTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppSessionBatchSyncRequestAppInfosTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAppSessionBatchSyncRequestAppInfos extends TeaModel {
        @NameInMap("AdapterFileId")
        public String adapterFileId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("CustomUserId")
        public String customUserId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CustomerSessionId")
        public String customerSessionId;

        @NameInMap("DistrictId")
        public String districtId;

        @NameInMap("MatchRules")
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosMatchRules> matchRules;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartParameters")
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosStartParameters> startParameters;

        @NameInMap("SystemInfo")
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosSystemInfo> systemInfo;

        @NameInMap("Tags")
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosTags> tags;

        public static CreateAppSessionBatchSyncRequestAppInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncRequestAppInfos self = new CreateAppSessionBatchSyncRequestAppInfos();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncRequestAppInfos setAdapterFileId(String adapterFileId) {
            this.adapterFileId = adapterFileId;
            return this;
        }
        public String getAdapterFileId() {
            return this.adapterFileId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setCustomerSessionId(String customerSessionId) {
            this.customerSessionId = customerSessionId;
            return this;
        }
        public String getCustomerSessionId() {
            return this.customerSessionId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setMatchRules(java.util.List<CreateAppSessionBatchSyncRequestAppInfosMatchRules> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosMatchRules> getMatchRules() {
            return this.matchRules;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setStartParameters(java.util.List<CreateAppSessionBatchSyncRequestAppInfosStartParameters> startParameters) {
            this.startParameters = startParameters;
            return this;
        }
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosStartParameters> getStartParameters() {
            return this.startParameters;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setSystemInfo(java.util.List<CreateAppSessionBatchSyncRequestAppInfosSystemInfo> systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosSystemInfo> getSystemInfo() {
            return this.systemInfo;
        }

        public CreateAppSessionBatchSyncRequestAppInfos setTags(java.util.List<CreateAppSessionBatchSyncRequestAppInfosTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateAppSessionBatchSyncRequestAppInfosTags> getTags() {
            return this.tags;
        }

    }

}
