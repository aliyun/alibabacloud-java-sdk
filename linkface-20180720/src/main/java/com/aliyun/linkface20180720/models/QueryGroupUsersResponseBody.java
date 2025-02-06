// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryGroupUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryGroupUsersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>27693DE6-1AB5-4C38-92F8-1632E3EF5D88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>134</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryGroupUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupUsersResponseBody self = new QueryGroupUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupUsersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryGroupUsersResponseBody setData(java.util.List<QueryGroupUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryGroupUsersResponseBodyData> getData() {
        return this.data;
    }

    public QueryGroupUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGroupUsersResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryGroupUsersResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryGroupUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGroupUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGroupUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryGroupUsersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryGroupUsersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dp</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryGroupUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupUsersResponseBodyData self = new QueryGroupUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGroupUsersResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
