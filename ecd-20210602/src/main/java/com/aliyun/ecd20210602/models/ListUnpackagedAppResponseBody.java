// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListUnpackagedAppResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<ListUnpackagedAppResponseBodyApps> apps;

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

    public static ListUnpackagedAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnpackagedAppResponseBody self = new ListUnpackagedAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnpackagedAppResponseBody setApps(java.util.List<ListUnpackagedAppResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListUnpackagedAppResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListUnpackagedAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUnpackagedAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUnpackagedAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUnpackagedAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUnpackagedAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnpackagedAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUnpackagedAppResponseBodyApps extends TeaModel {
        @NameInMap("AppId")
        public Integer appId;

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

        @NameInMap("Size")
        public Long size;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static ListUnpackagedAppResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListUnpackagedAppResponseBodyApps self = new ListUnpackagedAppResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListUnpackagedAppResponseBodyApps setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListUnpackagedAppResponseBodyApps setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListUnpackagedAppResponseBodyApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUnpackagedAppResponseBodyApps setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListUnpackagedAppResponseBodyApps setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListUnpackagedAppResponseBodyApps setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListUnpackagedAppResponseBodyApps setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListUnpackagedAppResponseBodyApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUnpackagedAppResponseBodyApps setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListUnpackagedAppResponseBodyApps setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListUnpackagedAppResponseBodyApps setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListUnpackagedAppResponseBodyApps setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUnpackagedAppResponseBodyApps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUnpackagedAppResponseBodyApps setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
