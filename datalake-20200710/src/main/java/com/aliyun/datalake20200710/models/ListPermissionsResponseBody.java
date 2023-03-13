// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPermissionsResponseBody extends TeaModel {
    /**
     * <p>Response Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message Code</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>NextPageToken</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PrincipalResourcePermissionsList")
    public java.util.List<PrincipalResourcePermissions> principalResourcePermissionsList;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>TotalCount</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsResponseBody self = new ListPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPermissionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPermissionsResponseBody setPrincipalResourcePermissionsList(java.util.List<PrincipalResourcePermissions> principalResourcePermissionsList) {
        this.principalResourcePermissionsList = principalResourcePermissionsList;
        return this;
    }
    public java.util.List<PrincipalResourcePermissions> getPrincipalResourcePermissionsList() {
        return this.principalResourcePermissionsList;
    }

    public ListPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPermissionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
