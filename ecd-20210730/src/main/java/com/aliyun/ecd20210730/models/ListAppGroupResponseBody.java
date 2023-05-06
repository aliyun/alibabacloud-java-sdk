// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppGroupResponseBodyData> data;

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

    public static ListAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupResponseBody self = new ListAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppGroupResponseBody setData(java.util.List<ListAppGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListAppGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppGroupResponseBodyData extends TeaModel {
        @NameInMap("AdaptorCount")
        public Long adaptorCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        public static ListAppGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupResponseBodyData self = new ListAppGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppGroupResponseBodyData setAdaptorCount(Long adaptorCount) {
            this.adaptorCount = adaptorCount;
            return this;
        }
        public Long getAdaptorCount() {
            return this.adaptorCount;
        }

        public ListAppGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAppGroupResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppGroupResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppGroupResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppGroupResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
