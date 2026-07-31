// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListBalanceOrdersResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     */
    @NameInMap("data")
    public ModelRouterListBalanceOrdersResponseBodyData data;

    /**
     * <p>The fault error message encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterListBalanceOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListBalanceOrdersResponseBody self = new ModelRouterListBalanceOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterListBalanceOrdersResponseBody setData(ModelRouterListBalanceOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterListBalanceOrdersResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterListBalanceOrdersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterListBalanceOrdersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterListBalanceOrdersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterListBalanceOrdersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterListBalanceOrdersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterListBalanceOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterListBalanceOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterListBalanceOrdersResponseBodyData extends TeaModel {
        /**
         * <p>The balance change log entries.</p>
         */
        @NameInMap("list")
        public java.util.List<BalanceOrderDTO> list;

        /**
         * <p>The requested page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterListBalanceOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterListBalanceOrdersResponseBodyData self = new ModelRouterListBalanceOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterListBalanceOrdersResponseBodyData setList(java.util.List<BalanceOrderDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<BalanceOrderDTO> getList() {
            return this.list;
        }

        public ModelRouterListBalanceOrdersResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterListBalanceOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterListBalanceOrdersResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
