// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceAllUserIdsByGroupIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserIdsByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserIdsByGroupIdResponseBody self = new QueryFaceAllUserIdsByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setData(QueryFaceAllUserIdsByGroupIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserIdsByGroupIdResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserIdsByGroupIdResponseBodyDataList extends TeaModel {
        @NameInMap("Params")
        public String params;

        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Name")
        public String name;

        public static QueryFaceAllUserIdsByGroupIdResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserIdsByGroupIdResponseBodyDataList self = new QueryFaceAllUserIdsByGroupIdResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryFaceAllUserIdsByGroupIdResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static QueryFaceAllUserIdsByGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserIdsByGroupIdResponseBodyData self = new QueryFaceAllUserIdsByGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyData setList(java.util.List<QueryFaceAllUserIdsByGroupIdResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
