// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryUserListResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterQueryUserListResponseBodyData data;

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

    public static ModelRouterQueryUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryUserListResponseBody self = new ModelRouterQueryUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryUserListResponseBody setData(ModelRouterQueryUserListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryUserListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryUserListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryUserListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryUserListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryUserListResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<UserListItemDTO> list;

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
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryUserListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryUserListResponseBodyData self = new ModelRouterQueryUserListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryUserListResponseBodyData setList(java.util.List<UserListItemDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<UserListItemDTO> getList() {
            return this.list;
        }

        public ModelRouterQueryUserListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryUserListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryUserListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
