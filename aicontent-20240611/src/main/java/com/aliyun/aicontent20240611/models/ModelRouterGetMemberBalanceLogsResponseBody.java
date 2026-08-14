// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberBalanceLogsResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterGetMemberBalanceLogsResponseBodyData data;

    /**
     * <p>The fault code.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterGetMemberBalanceLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberBalanceLogsResponseBody self = new ModelRouterGetMemberBalanceLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setData(ModelRouterGetMemberBalanceLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterGetMemberBalanceLogsResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterGetMemberBalanceLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterGetMemberBalanceLogsResponseBodyData extends TeaModel {
        /**
         * <p>The list of balance change logs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<ClientBalanceLogDTO> list;

        /**
         * <p>The page number.</p>
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
        @NameInMap("size")
        public Integer size;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterGetMemberBalanceLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterGetMemberBalanceLogsResponseBodyData self = new ModelRouterGetMemberBalanceLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterGetMemberBalanceLogsResponseBodyData setList(java.util.List<ClientBalanceLogDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ClientBalanceLogDTO> getList() {
            return this.list;
        }

        public ModelRouterGetMemberBalanceLogsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterGetMemberBalanceLogsResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModelRouterGetMemberBalanceLogsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
