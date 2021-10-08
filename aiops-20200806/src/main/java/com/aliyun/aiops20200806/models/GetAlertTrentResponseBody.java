// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertTrentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    public static GetAlertTrentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertTrentResponseBody self = new GetAlertTrentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertTrentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertTrentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAlertTrentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertTrentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAlertTrentResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetAlertTrentResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

}
