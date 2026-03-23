// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryObservationLogsResponseBodyData data;

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
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    public static ModelRouterQueryObservationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationLogsResponseBody self = new ModelRouterQueryObservationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationLogsResponseBody setData(ModelRouterQueryObservationLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryObservationLogsResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryObservationLogsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryObservationLogsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryObservationLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryObservationLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryObservationLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryObservationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryObservationLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryObservationLogsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<RequestLogDTO> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("nextToken")
        public Integer nextToken;

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
         * <p>None</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryObservationLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryObservationLogsResponseBodyData self = new ModelRouterQueryObservationLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryObservationLogsResponseBodyData setList(java.util.List<RequestLogDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<RequestLogDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryObservationLogsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ModelRouterQueryObservationLogsResponseBodyData setNextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public Integer getNextToken() {
            return this.nextToken;
        }

        public ModelRouterQueryObservationLogsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryObservationLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryObservationLogsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
