// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRoleUsersResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging token.</p>
     * 
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>558D764F-8C55-49CA-BF38-80EA532FC08F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The roles assigned to the user.</p>
     */
    @NameInMap("UserRoles")
    public java.util.List<UserRole> userRoles;

    public static ListRoleUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoleUsersResponseBody self = new ListRoleUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoleUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRoleUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRoleUsersResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRoleUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoleUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRoleUsersResponseBody setUserRoles(java.util.List<UserRole> userRoles) {
        this.userRoles = userRoles;
        return this;
    }
    public java.util.List<UserRole> getUserRoles() {
        return this.userRoles;
    }

}
