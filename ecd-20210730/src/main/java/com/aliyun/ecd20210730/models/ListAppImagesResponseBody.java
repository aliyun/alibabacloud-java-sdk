// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppImagesResponseBodyData> data;

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

    public static ListAppImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppImagesResponseBody self = new ListAppImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppImagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppImagesResponseBody setData(java.util.List<ListAppImagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppImagesResponseBodyData> getData() {
        return this.data;
    }

    public ListAppImagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppImagesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppImagesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppImagesResponseBodyData extends TeaModel {
        @NameInMap("AdaptorUid")
        public String adaptorUid;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uid")
        public String uid;

        public static ListAppImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppImagesResponseBodyData self = new ListAppImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppImagesResponseBodyData setAdaptorUid(String adaptorUid) {
            this.adaptorUid = adaptorUid;
            return this;
        }
        public String getAdaptorUid() {
            return this.adaptorUid;
        }

        public ListAppImagesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppImagesResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListAppImagesResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppImagesResponseBodyData setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public ListAppImagesResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppImagesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppImagesResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppImagesResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppImagesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAppImagesResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
