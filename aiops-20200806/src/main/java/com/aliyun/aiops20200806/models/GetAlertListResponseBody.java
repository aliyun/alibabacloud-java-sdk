// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertListResponseBody extends TeaModel {
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

    public static GetAlertListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertListResponseBody self = new GetAlertListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAlertListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAlertListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetAlertListResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

}
