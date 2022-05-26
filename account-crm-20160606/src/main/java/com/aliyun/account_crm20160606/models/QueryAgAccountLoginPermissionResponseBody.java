// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgAccountLoginPermissionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HasLoginPermission")
    public Boolean hasLoginPermission;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAgAccountLoginPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgAccountLoginPermissionResponseBody self = new QueryAgAccountLoginPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgAccountLoginPermissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgAccountLoginPermissionResponseBody setHasLoginPermission(Boolean hasLoginPermission) {
        this.hasLoginPermission = hasLoginPermission;
        return this;
    }
    public Boolean getHasLoginPermission() {
        return this.hasLoginPermission;
    }

    public QueryAgAccountLoginPermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgAccountLoginPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgAccountLoginPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
