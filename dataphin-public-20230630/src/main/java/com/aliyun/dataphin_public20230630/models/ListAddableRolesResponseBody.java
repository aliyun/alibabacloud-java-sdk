// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableRolesResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of roles.</p>
     */
    @NameInMap("RoleList")
    public java.util.List<ListAddableRolesResponseBodyRoleList> roleList;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAddableRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddableRolesResponseBody self = new ListAddableRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddableRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAddableRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAddableRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAddableRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddableRolesResponseBody setRoleList(java.util.List<ListAddableRolesResponseBodyRoleList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<ListAddableRolesResponseBodyRoleList> getRoleList() {
        return this.roleList;
    }

    public ListAddableRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAddableRolesResponseBodyRoleList extends TeaModel {
        /**
         * <p>The role code.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURITY_ADMIN</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>安全管理员</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAddableRolesResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListAddableRolesResponseBodyRoleList self = new ListAddableRolesResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public ListAddableRolesResponseBodyRoleList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAddableRolesResponseBodyRoleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
