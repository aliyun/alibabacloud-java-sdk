// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceBySQLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryDeviceBySQLResponseBodyData> data;

    public static QueryDeviceBySQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceBySQLResponseBody self = new QueryDeviceBySQLResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceBySQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceBySQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceBySQLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceBySQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceBySQLResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDeviceBySQLResponseBody setData(java.util.List<QueryDeviceBySQLResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceBySQLResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryDeviceBySQLResponseBodyDataGroups extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        public static QueryDeviceBySQLResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataGroups self = new QueryDeviceBySQLResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class QueryDeviceBySQLResponseBodyDataTags extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDeviceBySQLResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataTags self = new QueryDeviceBySQLResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryDeviceBySQLResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDeviceBySQLResponseBodyDataOTAModules extends TeaModel {
        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        public static QueryDeviceBySQLResponseBodyDataOTAModules build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyDataOTAModules self = new QueryDeviceBySQLResponseBodyDataOTAModules();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyDataOTAModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryDeviceBySQLResponseBodyDataOTAModules setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

    }

    public static class QueryDeviceBySQLResponseBodyData extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("Status")
        public String status;

        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Groups")
        public java.util.List<QueryDeviceBySQLResponseBodyDataGroups> groups;

        @NameInMap("Tags")
        public java.util.List<QueryDeviceBySQLResponseBodyDataTags> tags;

        @NameInMap("OTAModules")
        public java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> OTAModules;

        public static QueryDeviceBySQLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceBySQLResponseBodyData self = new QueryDeviceBySQLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceBySQLResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceBySQLResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceBySQLResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceBySQLResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceBySQLResponseBodyData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDeviceBySQLResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceBySQLResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceBySQLResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceBySQLResponseBodyData setGroups(java.util.List<QueryDeviceBySQLResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public QueryDeviceBySQLResponseBodyData setTags(java.util.List<QueryDeviceBySQLResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public QueryDeviceBySQLResponseBodyData setOTAModules(java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> OTAModules) {
            this.OTAModules = OTAModules;
            return this;
        }
        public java.util.List<QueryDeviceBySQLResponseBodyDataOTAModules> getOTAModules() {
            return this.OTAModules;
        }

    }

}
