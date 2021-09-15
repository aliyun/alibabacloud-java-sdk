// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAppResponseBodyData data;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setData(GetAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppResponseBodyData getData() {
        return this.data;
    }

    public static class GetAppResponseBodyData extends TeaModel {
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

        public static GetAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyData self = new GetAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyData setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public GetAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppResponseBodyData setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetAppResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetAppResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAppResponseBodyData setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

    }

}
