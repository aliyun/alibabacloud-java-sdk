// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppGroupImagesResponseBodyData> data;

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

    public static ListAppGroupImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupImagesResponseBody self = new ListAppGroupImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppGroupImagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppGroupImagesResponseBody setData(java.util.List<ListAppGroupImagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppGroupImagesResponseBodyData> getData() {
        return this.data;
    }

    public ListAppGroupImagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppGroupImagesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupImagesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppGroupImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppGroupImagesResponseBodyData extends TeaModel {
        @NameInMap("AdaptorCount")
        public Integer adaptorCount;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageUid")
        public String imageUid;

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

        public static ListAppGroupImagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupImagesResponseBodyData self = new ListAppGroupImagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppGroupImagesResponseBodyData setAdaptorCount(Integer adaptorCount) {
            this.adaptorCount = adaptorCount;
            return this;
        }
        public Integer getAdaptorCount() {
            return this.adaptorCount;
        }

        public ListAppGroupImagesResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListAppGroupImagesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppGroupImagesResponseBodyData setImageUid(String imageUid) {
            this.imageUid = imageUid;
            return this;
        }
        public String getImageUid() {
            return this.imageUid;
        }

        public ListAppGroupImagesResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public ListAppGroupImagesResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListAppGroupImagesResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppGroupImagesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppGroupImagesResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
