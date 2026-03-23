// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryApiKeyListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryApiKeyListResponseBodyData data;

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

    public static ModelRouterQueryApiKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryApiKeyListResponseBody self = new ModelRouterQueryApiKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryApiKeyListResponseBody setData(ModelRouterQueryApiKeyListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryApiKeyListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryApiKeyListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryApiKeyListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryApiKeyListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryApiKeyListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryApiKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryApiKeyListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryApiKeyListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ApiKeyDTO> list;

        @NameInMap("maxResult")
        public String maxResult;

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
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryApiKeyListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryApiKeyListResponseBodyData self = new ModelRouterQueryApiKeyListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryApiKeyListResponseBodyData setList(java.util.List<ApiKeyDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ApiKeyDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryApiKeyListResponseBodyData setMaxResult(String maxResult) {
            this.maxResult = maxResult;
            return this;
        }
        public String getMaxResult() {
            return this.maxResult;
        }

        public ModelRouterQueryApiKeyListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ModelRouterQueryApiKeyListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryApiKeyListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryApiKeyListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
