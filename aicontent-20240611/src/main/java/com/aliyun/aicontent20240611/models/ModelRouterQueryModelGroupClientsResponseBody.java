// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupClientsResponseBody extends TeaModel {
    /**
     * <p>The model usage table structure.</p>
     */
    @NameInMap("data")
    public ModelRouterQueryModelGroupClientsResponseBodyData data;

    /**
     * <p>The fault message code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This field is not used.</p>
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

    public static ModelRouterQueryModelGroupClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupClientsResponseBody self = new ModelRouterQueryModelGroupClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupClientsResponseBody setData(ModelRouterQueryModelGroupClientsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryModelGroupClientsResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryModelGroupClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryModelGroupClientsResponseBodyData extends TeaModel {
        /**
         * <p>The list of departments.</p>
         */
        @NameInMap("list")
        public java.util.List<ModelGroupClientDTO> list;

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
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryModelGroupClientsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryModelGroupClientsResponseBodyData self = new ModelRouterQueryModelGroupClientsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryModelGroupClientsResponseBodyData setList(java.util.List<ModelGroupClientDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ModelGroupClientDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryModelGroupClientsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryModelGroupClientsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryModelGroupClientsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
