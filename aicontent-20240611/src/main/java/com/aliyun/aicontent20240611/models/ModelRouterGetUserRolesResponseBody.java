// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetUserRolesResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterGetUserRolesResponseBodyData data;

    /**
     * <p>The error message code.</p>
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

    public static ModelRouterGetUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetUserRolesResponseBody self = new ModelRouterGetUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetUserRolesResponseBody setData(ModelRouterGetUserRolesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterGetUserRolesResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterGetUserRolesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterGetUserRolesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterGetUserRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterGetUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterGetUserRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterGetUserRolesResponseBodyData extends TeaModel {
        /**
         * <p>The list of department role assignments.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("departmentRoles")
        public java.util.List<UserDepartmentDTO> departmentRoles;

        public static ModelRouterGetUserRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterGetUserRolesResponseBodyData self = new ModelRouterGetUserRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterGetUserRolesResponseBodyData setDepartmentRoles(java.util.List<UserDepartmentDTO> departmentRoles) {
            this.departmentRoles = departmentRoles;
            return this;
        }
        public java.util.List<UserDepartmentDTO> getDepartmentRoles() {
            return this.departmentRoles;
        }

    }

}
