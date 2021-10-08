// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListAuthorizedUidResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Status")
    public String status;

    @NameInMap("Message")
    public String message;

    @NameInMap("List")
    public java.util.List<Long> list;

    public static ListAuthorizedUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUidResponseBody self = new ListAuthorizedUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedUidResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAuthorizedUidResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAuthorizedUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedUidResponseBody setList(java.util.List<Long> list) {
        this.list = list;
        return this;
    }
    public java.util.List<Long> getList() {
        return this.list;
    }

}
