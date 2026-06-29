// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyRolesResponseBody extends TeaModel {
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
    public java.util.List<GetMyRolesResponseBodyRoleList> roleList;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMyRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMyRolesResponseBody self = new GetMyRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMyRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMyRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMyRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMyRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMyRolesResponseBody setRoleList(java.util.List<GetMyRolesResponseBodyRoleList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<GetMyRolesResponseBodyRoleList> getRoleList() {
        return this.roleList;
    }

    public GetMyRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMyRolesResponseBodyRoleList extends TeaModel {
        /**
         * <p>The role description.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin管理员</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300047957</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphinAdmin</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetMyRolesResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            GetMyRolesResponseBodyRoleList self = new GetMyRolesResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public GetMyRolesResponseBodyRoleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMyRolesResponseBodyRoleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMyRolesResponseBodyRoleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
