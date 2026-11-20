// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientListResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;page&quot;:1,&quot;pageSize&quot;:10}</p>
     */
    @NameInMap("data")
    public ModelRouterQueryClientListResponseBodyData data;

    /**
     * <p>The fault message encoding.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryClientListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryClientListResponseBody self = new ModelRouterQueryClientListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryClientListResponseBody setData(ModelRouterQueryClientListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryClientListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryClientListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryClientListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryClientListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryClientListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryClientListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryClientListResponseBodyData extends TeaModel {
        /**
         * <p>The list of items.</p>
         */
        @NameInMap("list")
        public java.util.List<ClientDTO> list;

        /**
         * <p>maxResults</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxResults")
        public String maxResults;

        /**
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryClientListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryClientListResponseBodyData self = new ModelRouterQueryClientListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryClientListResponseBodyData setList(java.util.List<ClientDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ClientDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryClientListResponseBodyData setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ModelRouterQueryClientListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ModelRouterQueryClientListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryClientListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryClientListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
