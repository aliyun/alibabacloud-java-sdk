// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListApplyAuthorizationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("List")
    public java.util.Map<String, ?> list;

    public static ListApplyAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplyAuthorizationResponseBody self = new ListApplyAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplyAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplyAuthorizationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplyAuthorizationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplyAuthorizationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListApplyAuthorizationResponseBody setList(java.util.Map<String, ?> list) {
        this.list = list;
        return this;
    }
    public java.util.Map<String, ?> getList() {
        return this.list;
    }

}
