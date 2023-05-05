// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListMyAppResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<ListMyAppResponseBodyApps> apps;

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

    public static ListMyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyAppResponseBody self = new ListMyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyAppResponseBody setApps(java.util.List<ListMyAppResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListMyAppResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListMyAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMyAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMyAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListMyAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMyAppResponseBodyApps extends TeaModel {
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

        @NameInMap("Version")
        public String version;

        public static ListMyAppResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListMyAppResponseBodyApps self = new ListMyAppResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListMyAppResponseBodyApps setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListMyAppResponseBodyApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMyAppResponseBodyApps setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListMyAppResponseBodyApps setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListMyAppResponseBodyApps setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListMyAppResponseBodyApps setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListMyAppResponseBodyApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMyAppResponseBodyApps setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListMyAppResponseBodyApps setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListMyAppResponseBodyApps setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListMyAppResponseBodyApps setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListMyAppResponseBodyApps setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
