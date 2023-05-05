// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("App")
    public DescribeAppResponseBodyApp app;

    @NameInMap("Code")
    public String code;

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

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponseBody setApp(DescribeAppResponseBodyApp app) {
        this.app = app;
        return this;
    }
    public DescribeAppResponseBodyApp getApp() {
        return this.app;
    }

    public DescribeAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppResponseBodyApp extends TeaModel {
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("FileRealName")
        public String fileRealName;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("SandboxMode")
        public Boolean sandboxMode;

        @NameInMap("SilenceFlag")
        public Boolean silenceFlag;

        @NameInMap("SilenceParam")
        public String silenceParam;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Version")
        public String version;

        public static DescribeAppResponseBodyApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyApp self = new DescribeAppResponseBodyApp();
            return TeaModel.build(map, self);
        }

        public DescribeAppResponseBodyApp setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public DescribeAppResponseBodyApp setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppResponseBodyApp setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public DescribeAppResponseBodyApp setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public DescribeAppResponseBodyApp setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public DescribeAppResponseBodyApp setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeAppResponseBodyApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppResponseBodyApp setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAppResponseBodyApp setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public DescribeAppResponseBodyApp setSandboxMode(Boolean sandboxMode) {
            this.sandboxMode = sandboxMode;
            return this;
        }
        public Boolean getSandboxMode() {
            return this.sandboxMode;
        }

        public DescribeAppResponseBodyApp setSilenceFlag(Boolean silenceFlag) {
            this.silenceFlag = silenceFlag;
            return this;
        }
        public Boolean getSilenceFlag() {
            return this.silenceFlag;
        }

        public DescribeAppResponseBodyApp setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public DescribeAppResponseBodyApp setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAppResponseBodyApp setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAppResponseBodyApp setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAppResponseBodyApp setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
