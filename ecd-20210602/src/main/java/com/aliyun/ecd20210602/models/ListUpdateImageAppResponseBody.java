// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListUpdateImageAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListUpdateImageAppResponseBodyData> data;

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

    public static ListUpdateImageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpdateImageAppResponseBody self = new ListUpdateImageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpdateImageAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUpdateImageAppResponseBody setData(java.util.List<ListUpdateImageAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUpdateImageAppResponseBodyData> getData() {
        return this.data;
    }

    public ListUpdateImageAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUpdateImageAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUpdateImageAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUpdateImageAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUpdateImageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUpdateImageAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUpdateImageAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUpdateImageAppResponseBodyData extends TeaModel {
        @NameInMap("AdaptorUid")
        public String adaptorUid;

        @NameInMap("AppTag")
        public java.util.List<String> appTag;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Integer id;

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

        public static ListUpdateImageAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUpdateImageAppResponseBodyData self = new ListUpdateImageAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUpdateImageAppResponseBodyData setAdaptorUid(String adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public String getAdaptorUid() {
            return this.adaptorUid;
        }

        public ListUpdateImageAppResponseBodyData setAppTag(java.util.List<String> appTag) {
            this.appTag = appTag;
            return this;
        }
        public java.util.List<String> getAppTag() {
            return this.appTag;
        }

        public ListUpdateImageAppResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListUpdateImageAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUpdateImageAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListUpdateImageAppResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListUpdateImageAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUpdateImageAppResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListUpdateImageAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUpdateImageAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListUpdateImageAppResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
