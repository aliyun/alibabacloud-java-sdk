// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListDeptMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterListDeptMembersResponseBodyData data;

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

    public static ModelRouterListDeptMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListDeptMembersResponseBody self = new ModelRouterListDeptMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterListDeptMembersResponseBody setData(ModelRouterListDeptMembersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterListDeptMembersResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterListDeptMembersResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterListDeptMembersResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterListDeptMembersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterListDeptMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterListDeptMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterListDeptMembersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<DeptMemberDTO> list;

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
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterListDeptMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterListDeptMembersResponseBodyData self = new ModelRouterListDeptMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterListDeptMembersResponseBodyData setList(java.util.List<DeptMemberDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DeptMemberDTO> getList() {
            return this.list;
        }

        public ModelRouterListDeptMembersResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterListDeptMembersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterListDeptMembersResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
