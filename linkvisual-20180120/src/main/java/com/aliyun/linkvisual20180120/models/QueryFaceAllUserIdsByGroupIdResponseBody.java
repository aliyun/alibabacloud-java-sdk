// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryFaceAllUserIdsByGroupIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserIdsByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserIdsByGroupIdResponseBody self = new QueryFaceAllUserIdsByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryFaceAllUserIdsByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserIdsByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserIdsByGroupIdResponseBodyDataList extends TeaModel {
        @NameInMap("CustomUserId")
        public String customUserId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceAllUserIdsByGroupIdResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserIdsByGroupIdResponseBodyDataList self = new QueryFaceAllUserIdsByGroupIdResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryFaceAllUserIdsByGroupIdResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryFaceAllUserIdsByGroupIdResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseBodyDataList> list;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

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

        public QueryFaceAllUserIdsByGroupIdResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
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

    }

}
