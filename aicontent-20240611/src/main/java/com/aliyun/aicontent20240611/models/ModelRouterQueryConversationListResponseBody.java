// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryConversationListResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryConversationListResponseBodyData data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
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
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. A value of <code>true</code> indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterQueryConversationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryConversationListResponseBody self = new ModelRouterQueryConversationListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryConversationListResponseBody setData(ModelRouterQueryConversationListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryConversationListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryConversationListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryConversationListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryConversationListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryConversationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryConversationListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryConversationListResponseBodyData extends TeaModel {
        /**
         * <p>A list of conversation objects.</p>
         */
        @NameInMap("list")
        public java.util.List<ConversationDTO> list;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxResult")
        public String maxResult;

        /**
         * <p>The token to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <p>The number of conversations on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of conversations.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryConversationListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryConversationListResponseBodyData self = new ModelRouterQueryConversationListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryConversationListResponseBodyData setList(java.util.List<ConversationDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ConversationDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryConversationListResponseBodyData setMaxResult(String maxResult) {
            this.maxResult = maxResult;
            return this;
        }
        public String getMaxResult() {
            return this.maxResult;
        }

        public ModelRouterQueryConversationListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ModelRouterQueryConversationListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryConversationListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryConversationListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
