// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppTagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAppTagesResponseBodyData> data;

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

    public static ListAppTagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppTagesResponseBody self = new ListAppTagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppTagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppTagesResponseBody setData(java.util.List<ListAppTagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppTagesResponseBodyData> getData() {
        return this.data;
    }

    public ListAppTagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppTagesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAppTagesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppTagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppTagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppTagesResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Uid")
        public String uid;

        public static ListAppTagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppTagesResponseBodyData self = new ListAppTagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppTagesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppTagesResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
