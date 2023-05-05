// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAppVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppVersionResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionResponseBody self = new ListAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionResponseBody setData(java.util.List<ListAppVersionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppVersionResponseBodyData> getData() {
        return this.data;
    }

    public ListAppVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppVersionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppVersionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppVersionResponseBodyData extends TeaModel {
        @NameInMap("AdapterMode")
        public String adapterMode;

        @NameInMap("AdapterUid")
        public String adapterUid;

        @NameInMap("AppCateId")
        public Integer appCateId;

        @NameInMap("AppCateName")
        public String appCateName;

        @NameInMap("AppDescription")
        public String appDescription;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppRegInfo")
        public String appRegInfo;

        @NameInMap("AppSize")
        public Long appSize;

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

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("ExecuteFile")
        public String executeFile;

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

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsvId")
        public Long isvId;

        @NameInMap("OriginAppType")
        public String originAppType;

        @NameInMap("OssAppUrl")
        public String ossAppUrl;

        @NameInMap("ProcessInstId")
        public String processInstId;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VersionUid")
        public String versionUid;

        @NameInMap("WebUrl")
        public String webUrl;

        public static ListAppVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionResponseBodyData self = new ListAppVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppVersionResponseBodyData setAdapterMode(String adapterMode) {
            this.adapterMode = adapterMode;
            return this;
        }
        public String getAdapterMode() {
            return this.adapterMode;
        }

        public ListAppVersionResponseBodyData setAdapterUid(String adapterUid) {
            this.adapterUid = adapterUid;
            return this;
        }
        public String getAdapterUid() {
            return this.adapterUid;
        }

        public ListAppVersionResponseBodyData setAppCateId(Integer appCateId) {
            this.appCateId = appCateId;
            return this;
        }
        public Integer getAppCateId() {
            return this.appCateId;
        }

        public ListAppVersionResponseBodyData setAppCateName(String appCateName) {
            this.appCateName = appCateName;
            return this;
        }
        public String getAppCateName() {
            return this.appCateName;
        }

        public ListAppVersionResponseBodyData setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListAppVersionResponseBodyData setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListAppVersionResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListAppVersionResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppVersionResponseBodyData setAppRegInfo(String appRegInfo) {
            this.appRegInfo = appRegInfo;
            return this;
        }
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        public ListAppVersionResponseBodyData setAppSize(Long appSize) {
            this.appSize = appSize;
            return this;
        }
        public Long getAppSize() {
            return this.appSize;
        }

        public ListAppVersionResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAppVersionResponseBodyData setCopyrightDownloadUrl(String copyrightDownloadUrl) {
            this.copyrightDownloadUrl = copyrightDownloadUrl;
            return this;
        }
        public String getCopyrightDownloadUrl() {
            return this.copyrightDownloadUrl;
        }

        public ListAppVersionResponseBodyData setCopyrightName(String copyrightName) {
            this.copyrightName = copyrightName;
            return this;
        }
        public String getCopyrightName() {
            return this.copyrightName;
        }

        public ListAppVersionResponseBodyData setCopyrightPath(String copyrightPath) {
            this.copyrightPath = copyrightPath;
            return this;
        }
        public String getCopyrightPath() {
            return this.copyrightPath;
        }

        public ListAppVersionResponseBodyData setCopyrightRealName(String copyrightRealName) {
            this.copyrightRealName = copyrightRealName;
            return this;
        }
        public String getCopyrightRealName() {
            return this.copyrightRealName;
        }

        public ListAppVersionResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppVersionResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListAppVersionResponseBodyData setExecuteFile(String executeFile) {
            this.executeFile = executeFile;
            return this;
        }
        public String getExecuteFile() {
            return this.executeFile;
        }

        public ListAppVersionResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListAppVersionResponseBodyData setFileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        public ListAppVersionResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListAppVersionResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAppVersionResponseBodyData setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListAppVersionResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAppVersionResponseBodyData setIsvId(Long isvId) {
            this.isvId = isvId;
            return this;
        }
        public Long getIsvId() {
            return this.isvId;
        }

        public ListAppVersionResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListAppVersionResponseBodyData setOssAppUrl(String ossAppUrl) {
            this.ossAppUrl = ossAppUrl;
            return this;
        }
        public String getOssAppUrl() {
            return this.ossAppUrl;
        }

        public ListAppVersionResponseBodyData setProcessInstId(String processInstId) {
            this.processInstId = processInstId;
            return this;
        }
        public String getProcessInstId() {
            return this.processInstId;
        }

        public ListAppVersionResponseBodyData setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public ListAppVersionResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListAppVersionResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppVersionResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAppVersionResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListAppVersionResponseBodyData setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

        public ListAppVersionResponseBodyData setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
