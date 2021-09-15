// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CloneAppResponseBodyData data;

    public static CloneAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneAppResponseBody self = new CloneAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneAppResponseBody setData(CloneAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloneAppResponseBodyData getData() {
        return this.data;
    }

    public static class CloneAppResponseBodyData extends TeaModel {
        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("Source")
        public String source;

        @NameInMap("LastEditTime")
        public String lastEditTime;

        public static CloneAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloneAppResponseBodyData self = new CloneAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloneAppResponseBodyData setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public CloneAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CloneAppResponseBodyData setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CloneAppResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CloneAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloneAppResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloneAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CloneAppResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CloneAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public CloneAppResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CloneAppResponseBodyData setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

    }

}
