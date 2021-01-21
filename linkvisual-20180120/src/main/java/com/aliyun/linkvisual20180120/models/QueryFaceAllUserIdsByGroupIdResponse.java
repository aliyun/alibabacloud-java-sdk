// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryFaceAllUserIdsByGroupIdResponseData data;

    public static QueryFaceAllUserIdsByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserIdsByGroupIdResponse self = new QueryFaceAllUserIdsByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserIdsByGroupIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserIdsByGroupIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceAllUserIdsByGroupIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserIdsByGroupIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserIdsByGroupIdResponse setData(QueryFaceAllUserIdsByGroupIdResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserIdsByGroupIdResponseData getData() {
        return this.data;
    }

    public static class QueryFaceAllUserIdsByGroupIdResponseDataList extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("CustomUserId")
        @Validation(required = true)
        public String customUserId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Params")
        @Validation(required = true)
        public String params;

        public static QueryFaceAllUserIdsByGroupIdResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserIdsByGroupIdResponseDataList self = new QueryFaceAllUserIdsByGroupIdResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserIdsByGroupIdResponseDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryFaceAllUserIdsByGroupIdResponseDataList setCustomUserId(String customUserId) {
            this.customUserId = customUserId;
            return this;
        }
        public String getCustomUserId() {
            return this.customUserId;
        }

        public QueryFaceAllUserIdsByGroupIdResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFaceAllUserIdsByGroupIdResponseDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

    public static class QueryFaceAllUserIdsByGroupIdResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseDataList> list;

        public static QueryFaceAllUserIdsByGroupIdResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserIdsByGroupIdResponseData self = new QueryFaceAllUserIdsByGroupIdResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserIdsByGroupIdResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllUserIdsByGroupIdResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserIdsByGroupIdResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryFaceAllUserIdsByGroupIdResponseData setList(java.util.List<QueryFaceAllUserIdsByGroupIdResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseDataList> getList() {
            return this.list;
        }

    }

}
