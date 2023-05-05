// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListImageAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListImageAppResponseBodyData> data;

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

    public static ListImageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageAppResponseBody self = new ListImageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageAppResponseBody setData(java.util.List<ListImageAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageAppResponseBodyData> getData() {
        return this.data;
    }

    public ListImageAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageAppResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImageAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListImageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListImageAppResponseBodyData extends TeaModel {
        @NameInMap("AppTag")
        public java.util.List<String> appTag;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionName")
        public String versionName;

        public static ListImageAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageAppResponseBodyData self = new ListImageAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageAppResponseBodyData setAppTag(java.util.List<String> appTag) {
            this.appTag = appTag;
            return this;
        }
        public java.util.List<String> getAppTag() {
            return this.appTag;
        }

        public ListImageAppResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListImageAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListImageAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListImageAppResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListImageAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImageAppResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListImageAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImageAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListImageAppResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
