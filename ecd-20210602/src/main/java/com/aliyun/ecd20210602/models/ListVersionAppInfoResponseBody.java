// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListVersionAppInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListVersionAppInfoResponseBodyData> data;

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

    public static ListVersionAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionAppInfoResponseBody self = new ListVersionAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionAppInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVersionAppInfoResponseBody setData(java.util.List<ListVersionAppInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVersionAppInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListVersionAppInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVersionAppInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVersionAppInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVersionAppInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVersionAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionAppInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVersionAppInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListVersionAppInfoResponseBodyData extends TeaModel {
        @NameInMap("AdaptorUid")
        public String adaptorUid;

        @NameInMap("AppTag")
        public java.util.List<String> appTag;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("CateId")
        public Integer cateId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerOs")
        public String ownerOs;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionName")
        public String versionName;

        public static ListVersionAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVersionAppInfoResponseBodyData self = new ListVersionAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVersionAppInfoResponseBodyData setAdaptorUid(String adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public String getAdaptorUid() {
            return this.adaptorUid;
        }

        public ListVersionAppInfoResponseBodyData setAppTag(java.util.List<String> appTag) {
            this.appTag = appTag;
            return this;
        }
        public java.util.List<String> getAppTag() {
            return this.appTag;
        }

        public ListVersionAppInfoResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListVersionAppInfoResponseBodyData setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public ListVersionAppInfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVersionAppInfoResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListVersionAppInfoResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListVersionAppInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVersionAppInfoResponseBodyData setOwnerOs(String ownerOs) {
            this.ownerOs = ownerOs;
            return this;
        }
        public String getOwnerOs() {
            return this.ownerOs;
        }

        public ListVersionAppInfoResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListVersionAppInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVersionAppInfoResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListVersionAppInfoResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
