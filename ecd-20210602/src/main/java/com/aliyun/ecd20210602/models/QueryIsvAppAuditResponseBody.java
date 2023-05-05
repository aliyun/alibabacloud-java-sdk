// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryIsvAppAuditResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryIsvAppAuditResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryIsvAppAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIsvAppAuditResponseBody self = new QueryIsvAppAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIsvAppAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIsvAppAuditResponseBody setData(QueryIsvAppAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryIsvAppAuditResponseBodyData getData() {
        return this.data;
    }

    public QueryIsvAppAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIsvAppAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryIsvAppAuditResponseBodyData extends TeaModel {
        @NameInMap("AppCateId")
        public Integer appCateId;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CopyrightDownloadUrl")
        public String copyrightDownloadUrl;

        @NameInMap("CopyrightName")
        public String copyrightName;

        @NameInMap("CopyrightPath")
        public String copyrightPath;

        @NameInMap("CopyrightRealName")
        public String copyrightRealName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("FileDownloadUrl")
        public String fileDownloadUrl;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileRealName")
        public String fileRealName;

        @NameInMap("OriginAppType")
        public String originAppType;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryIsvAppAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIsvAppAuditResponseBodyData self = new QueryIsvAppAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIsvAppAuditResponseBodyData setAppCateId(Integer appCateId) {
            this.appCateId = appCateId;
            return this;
        }
        public Integer getAppCateId() {
            return this.appCateId;
        }

        public QueryIsvAppAuditResponseBodyData setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public QueryIsvAppAuditResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public QueryIsvAppAuditResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryIsvAppAuditResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryIsvAppAuditResponseBodyData setCopyrightDownloadUrl(String copyrightDownloadUrl) {
            this.copyrightDownloadUrl = copyrightDownloadUrl;
            return this;
        }
        public String getCopyrightDownloadUrl() {
            return this.copyrightDownloadUrl;
        }

        public QueryIsvAppAuditResponseBodyData setCopyrightName(String copyrightName) {
            this.copyrightName = copyrightName;
            return this;
        }
        public String getCopyrightName() {
            return this.copyrightName;
        }

        public QueryIsvAppAuditResponseBodyData setCopyrightPath(String copyrightPath) {
            this.copyrightPath = copyrightPath;
            return this;
        }
        public String getCopyrightPath() {
            return this.copyrightPath;
        }

        public QueryIsvAppAuditResponseBodyData setCopyrightRealName(String copyrightRealName) {
            this.copyrightRealName = copyrightRealName;
            return this;
        }
        public String getCopyrightRealName() {
            return this.copyrightRealName;
        }

        public QueryIsvAppAuditResponseBodyData setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryIsvAppAuditResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public QueryIsvAppAuditResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryIsvAppAuditResponseBodyData setFileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        public QueryIsvAppAuditResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryIsvAppAuditResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public QueryIsvAppAuditResponseBodyData setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public QueryIsvAppAuditResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public QueryIsvAppAuditResponseBodyData setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public QueryIsvAppAuditResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryIsvAppAuditResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryIsvAppAuditResponseBodyData setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public QueryIsvAppAuditResponseBodyData setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
