// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberApiKeysResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterGetMemberApiKeysResponseBodyData data;

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

    public static ModelRouterGetMemberApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberApiKeysResponseBody self = new ModelRouterGetMemberApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberApiKeysResponseBody setData(ModelRouterGetMemberApiKeysResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterGetMemberApiKeysResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterGetMemberApiKeysResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterGetMemberApiKeysResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterGetMemberApiKeysResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterGetMemberApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterGetMemberApiKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterGetMemberApiKeysResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<MemberApiKeyDTO> list;

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

        public static ModelRouterGetMemberApiKeysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterGetMemberApiKeysResponseBodyData self = new ModelRouterGetMemberApiKeysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterGetMemberApiKeysResponseBodyData setList(java.util.List<MemberApiKeyDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<MemberApiKeyDTO> getList() {
            return this.list;
        }

        public ModelRouterGetMemberApiKeysResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterGetMemberApiKeysResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterGetMemberApiKeysResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
