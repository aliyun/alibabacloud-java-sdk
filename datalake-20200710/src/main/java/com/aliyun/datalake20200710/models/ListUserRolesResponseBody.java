// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListUserRolesResponseBody extends TeaModel {
    /**
     * <p>Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>NextPageToken</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>UserRoles</p>
     */
    @NameInMap("UserRoles")
    public java.util.List<UserRole> userRoles;

    public static ListUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesResponseBody self = new ListUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserRolesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserRolesResponseBody setUserRoles(java.util.List<UserRole> userRoles) {
        this.userRoles = userRoles;
        return this;
    }
    public java.util.List<UserRole> getUserRoles() {
        return this.userRoles;
    }

}
