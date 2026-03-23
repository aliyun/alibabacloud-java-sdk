// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryConversationListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ModelRouterQueryConversationListResponseBodyData data;

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
        @NameInMap("list")
        public java.util.List<ConversationDTO> list;

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
