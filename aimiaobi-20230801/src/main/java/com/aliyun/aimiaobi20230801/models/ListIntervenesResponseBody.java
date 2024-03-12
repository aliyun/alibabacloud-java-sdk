// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListIntervenesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListIntervenesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListIntervenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntervenesResponseBody self = new ListIntervenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntervenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIntervenesResponseBody setData(ListIntervenesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIntervenesResponseBodyData getData() {
        return this.data;
    }

    public ListIntervenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIntervenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIntervenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntervenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIntervenesResponseBodyDataInterveneList extends TeaModel {
        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Query")
        public String query;

        public static ListIntervenesResponseBodyDataInterveneList build(java.util.Map<String, ?> map) throws Exception {
            ListIntervenesResponseBodyDataInterveneList self = new ListIntervenesResponseBodyDataInterveneList();
            return TeaModel.build(map, self);
        }

        public ListIntervenesResponseBodyDataInterveneList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIntervenesResponseBodyDataInterveneList setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class ListIntervenesResponseBodyData extends TeaModel {
        @NameInMap("InterveneList")
        public java.util.List<ListIntervenesResponseBodyDataInterveneList> interveneList;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListIntervenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntervenesResponseBodyData self = new ListIntervenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntervenesResponseBodyData setInterveneList(java.util.List<ListIntervenesResponseBodyDataInterveneList> interveneList) {
            this.interveneList = interveneList;
            return this;
        }
        public java.util.List<ListIntervenesResponseBodyDataInterveneList> getInterveneList() {
            return this.interveneList;
        }

        public ListIntervenesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListIntervenesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIntervenesResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
