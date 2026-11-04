// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryFaceAllUserIdsByGroupIdResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The user ID in the caller service.</p>
         * 
         * <strong>example:</strong>
         * <p>TestCustomUserId</p>
         */
        @NameInMap("CustomUserId")
        public String customUserId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserId</p>
         */
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
        /**
         * <p>The list of users.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryFaceAllUserIdsByGroupIdResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of users.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
