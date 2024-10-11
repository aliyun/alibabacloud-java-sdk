// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableRolesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleList")
    public java.util.List<ListAddableRolesResponseBodyRoleList> roleList;

    /**
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
         * <strong>example:</strong>
         * <p>SECURITY_ADMIN</p>
         */
        @NameInMap("Code")
        public String code;

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
