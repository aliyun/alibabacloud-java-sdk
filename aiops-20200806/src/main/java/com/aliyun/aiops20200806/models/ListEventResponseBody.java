// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListEventResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("List")
    public java.util.List<java.util.Map<String, ?>> list;

    @NameInMap("PageTotal")
    public Long pageTotal;

    public static ListEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventResponseBody self = new ListEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEventResponseBody setList(java.util.List<java.util.Map<String, ?>> list) {
        this.list = list;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getList() {
        return this.list;
    }

    public ListEventResponseBody setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Long getPageTotal() {
        return this.pageTotal;
    }

}
