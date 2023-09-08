// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetServiceDataImportStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, DataValue> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceDataImportStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDataImportStatusResponseBody self = new GetServiceDataImportStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceDataImportStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceDataImportStatusResponseBody setData(java.util.Map<String, DataValue> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, DataValue> getData() {
        return this.data;
    }

    public GetServiceDataImportStatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetServiceDataImportStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceDataImportStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
