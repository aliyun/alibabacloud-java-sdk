// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryDeviceBySQLResponseData> data;

    public static QueryDeviceBySQLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceBySQLResponse self = new QueryDeviceBySQLResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceBySQLResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceBySQLResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceBySQLResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceBySQLResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceBySQLResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDeviceBySQLResponse setData(java.util.List<QueryDeviceBySQLResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceBySQLResponseData> getData() {
        return this.data;
    }

    public static class QueryDeviceBySQLResponseDataGroups extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static QueryDeviceBySQLResponseDataGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseDataGroups self = new QueryDeviceBySQLResponseDataGroups();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseDataGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class QueryDeviceBySQLResponseDataTags extends TeaModel {
        @NameInMap("TagName")
        @Validation(required = true)
        public String tagName;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static QueryDeviceBySQLResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseDataTags self = new QueryDeviceBySQLResponseDataTags();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseDataTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryDeviceBySQLResponseDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceBySQLResponseDataOTAModules extends TeaModel {
        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        @NameInMap("FirmwareVersion")
        @Validation(required = true)
        public String firmwareVersion;

        public static QueryDeviceBySQLResponseDataOTAModules build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseDataOTAModules self = new QueryDeviceBySQLResponseDataOTAModules();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseDataOTAModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryDeviceBySQLResponseDataOTAModules setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

    }

    public static class QueryDeviceBySQLResponseData extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("Nickname")
        @Validation(required = true)
        public String nickname;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ActiveTime")
        @Validation(required = true)
        public String activeTime;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Groups")
        @Validation(required = true)
        public java.util.List<QueryDeviceBySQLResponseDataGroups> groups;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<QueryDeviceBySQLResponseDataTags> tags;

        @NameInMap("OTAModules")
        @Validation(required = true)
        public java.util.List<QueryDeviceBySQLResponseDataOTAModules> OTAModules;

        public static QueryDeviceBySQLResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseData self = new QueryDeviceBySQLResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceBySQLResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceBySQLResponseData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceBySQLResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceBySQLResponseData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDeviceBySQLResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceBySQLResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceBySQLResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceBySQLResponseData setGroups(java.util.List<QueryDeviceBySQLResponseDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseDataGroups> getGroups() {
            return this.groups;
        }

        public QueryDeviceBySQLResponseData setTags(java.util.List<QueryDeviceBySQLResponseDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseDataTags> getTags() {
            return this.tags;
        }

        public QueryDeviceBySQLResponseData setOTAModules(java.util.List<QueryDeviceBySQLResponseDataOTAModules> OTAModules) {
            this.OTAModules = OTAModules;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseDataOTAModules> getOTAModules() {
            return this.OTAModules;
        }

    }

}
