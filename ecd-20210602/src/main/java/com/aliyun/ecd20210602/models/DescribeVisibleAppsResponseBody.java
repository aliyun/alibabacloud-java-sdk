// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeVisibleAppsResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<DescribeVisibleAppsResponseBodyApps> apps;

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

    public static DescribeVisibleAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisibleAppsResponseBody self = new DescribeVisibleAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVisibleAppsResponseBody setApps(java.util.List<DescribeVisibleAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<DescribeVisibleAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public DescribeVisibleAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVisibleAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVisibleAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVisibleAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVisibleAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVisibleAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVisibleAppsResponseBodyApps extends TeaModel {
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

        @NameInMap("Size")
        public Long size;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Version")
        public String version;

        public static DescribeVisibleAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeVisibleAppsResponseBodyApps self = new DescribeVisibleAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public DescribeVisibleAppsResponseBodyApps setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public DescribeVisibleAppsResponseBodyApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVisibleAppsResponseBodyApps setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public DescribeVisibleAppsResponseBodyApps setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public DescribeVisibleAppsResponseBodyApps setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public DescribeVisibleAppsResponseBodyApps setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeVisibleAppsResponseBodyApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVisibleAppsResponseBodyApps setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeVisibleAppsResponseBodyApps setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public DescribeVisibleAppsResponseBodyApps setSandboxMode(Boolean sandboxMode) {
            this.sandboxMode = sandboxMode;
            return this;
        }
        public Boolean getSandboxMode() {
            return this.sandboxMode;
        }

        public DescribeVisibleAppsResponseBodyApps setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeVisibleAppsResponseBodyApps setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeVisibleAppsResponseBodyApps setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVisibleAppsResponseBodyApps setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
