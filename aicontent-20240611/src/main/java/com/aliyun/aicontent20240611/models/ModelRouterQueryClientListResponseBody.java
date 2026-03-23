// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryClientListResponseBodyData data;

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
        @NameInMap("list")
        public java.util.List<ClientDTO> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("maxResults")
        public String maxResults;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        @NameInMap("page")
        public Integer page;

        @NameInMap("pageSize")
        public Integer pageSize;

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
