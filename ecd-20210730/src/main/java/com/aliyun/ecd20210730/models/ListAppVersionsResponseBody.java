// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppVersionsResponseBodyData> data;

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

    public static ListAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsResponseBody self = new ListAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionsResponseBody setData(java.util.List<ListAppVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppVersionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppVersionsResponseBodyData extends TeaModel {
        @NameInMap("AdaptorComplishCount")
        public Long adaptorComplishCount;

        @NameInMap("AdaptorCount")
        public Long adaptorCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ListAdaptor")
        public String listAdaptor;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public String number;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Uid")
        public String uid;

        public static ListAppVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionsResponseBodyData self = new ListAppVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppVersionsResponseBodyData setAdaptorComplishCount(Long adaptorComplishCount) {
            this.adaptorComplishCount = adaptorComplishCount;
            return this;
        }
        public Long getAdaptorComplishCount() {
            return this.adaptorComplishCount;
        }

        public ListAppVersionsResponseBodyData setAdaptorCount(Long adaptorCount) {
            this.adaptorCount = adaptorCount;
            return this;
        }
        public Long getAdaptorCount() {
            return this.adaptorCount;
        }

        public ListAppVersionsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppVersionsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppVersionsResponseBodyData setListAdaptor(String listAdaptor) {
            this.listAdaptor = listAdaptor;
            return this;
        }
        public String getListAdaptor() {
            return this.listAdaptor;
        }

        public ListAppVersionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppVersionsResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListAppVersionsResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppVersionsResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppVersionsResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListAppVersionsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
