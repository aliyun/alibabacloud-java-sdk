// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryModelListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelListResponseBody self = new ModelRouterQueryModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelListResponseBody setData(ModelRouterQueryModelListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryModelListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryModelListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryModelListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryModelListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryModelListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryModelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryModelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryModelListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ModelDTO> list;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("maxResults")
        public String maxResults;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total")
        public String total;

        public static ModelRouterQueryModelListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryModelListResponseBodyData self = new ModelRouterQueryModelListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryModelListResponseBodyData setList(java.util.List<ModelDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ModelDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryModelListResponseBodyData setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ModelRouterQueryModelListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ModelRouterQueryModelListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryModelListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryModelListResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
