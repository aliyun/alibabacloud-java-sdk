// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListMemberBalanceOrdersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterListMemberBalanceOrdersResponseBodyData data;

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

    public static ModelRouterListMemberBalanceOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListMemberBalanceOrdersResponseBody self = new ModelRouterListMemberBalanceOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setData(ModelRouterListMemberBalanceOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterListMemberBalanceOrdersResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterListMemberBalanceOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterListMemberBalanceOrdersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<BillOrderEntryDTO> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterListMemberBalanceOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterListMemberBalanceOrdersResponseBodyData self = new ModelRouterListMemberBalanceOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterListMemberBalanceOrdersResponseBodyData setList(java.util.List<BillOrderEntryDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<BillOrderEntryDTO> getList() {
            return this.list;
        }

        public ModelRouterListMemberBalanceOrdersResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterListMemberBalanceOrdersResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModelRouterListMemberBalanceOrdersResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
