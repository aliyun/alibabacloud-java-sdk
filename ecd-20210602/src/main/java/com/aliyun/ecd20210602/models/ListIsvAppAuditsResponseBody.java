// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListIsvAppAuditsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListIsvAppAuditsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIsvAppAuditsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsvAppAuditsResponseBody self = new ListIsvAppAuditsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsvAppAuditsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIsvAppAuditsResponseBody setData(java.util.List<ListIsvAppAuditsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIsvAppAuditsResponseBodyData> getData() {
        return this.data;
    }

    public ListIsvAppAuditsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIsvAppAuditsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIsvAppAuditsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListIsvAppAuditsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsvAppAuditsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIsvAppAuditsResponseBodyData extends TeaModel {
        @NameInMap("AppCateId")
        public Integer appCateId;

        @NameInMap("AppIconUrl")
        public String appIconUrl;

        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppRegInfo")
        public String appRegInfo;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CopyrightDownloadUrl")
        public String copyrightDownloadUrl;

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

        @NameInMap("Id")
        public Integer id;

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

        public static ListIsvAppAuditsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIsvAppAuditsResponseBodyData self = new ListIsvAppAuditsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIsvAppAuditsResponseBodyData setAppCateId(Integer appCateId) {
            this.appCateId = appCateId;
            return this;
        }
        public Integer getAppCateId() {
            return this.appCateId;
        }

        public ListIsvAppAuditsResponseBodyData setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListIsvAppAuditsResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListIsvAppAuditsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIsvAppAuditsResponseBodyData setAppRegInfo(String appRegInfo) {
            this.appRegInfo = appRegInfo;
            return this;
        }
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        public ListIsvAppAuditsResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListIsvAppAuditsResponseBodyData setCopyrightDownloadUrl(String copyrightDownloadUrl) {
            this.copyrightDownloadUrl = copyrightDownloadUrl;
            return this;
        }
        public String getCopyrightDownloadUrl() {
            return this.copyrightDownloadUrl;
        }

        public ListIsvAppAuditsResponseBodyData setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListIsvAppAuditsResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListIsvAppAuditsResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListIsvAppAuditsResponseBodyData setFileDownloadUrl(String fileDownloadUrl) {
            this.fileDownloadUrl = fileDownloadUrl;
            return this;
        }
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        public ListIsvAppAuditsResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListIsvAppAuditsResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListIsvAppAuditsResponseBodyData setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListIsvAppAuditsResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListIsvAppAuditsResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListIsvAppAuditsResponseBodyData setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public ListIsvAppAuditsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListIsvAppAuditsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListIsvAppAuditsResponseBodyData setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListIsvAppAuditsResponseBodyData setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
