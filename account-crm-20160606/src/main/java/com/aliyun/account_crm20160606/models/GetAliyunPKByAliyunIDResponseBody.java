// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAliyunPKByAliyunIDResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAliyunPKByAliyunIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunPKByAliyunIDResponseBody self = new GetAliyunPKByAliyunIDResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliyunPKByAliyunIDResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliyunPKByAliyunIDResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAliyunPKByAliyunIDResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetAliyunPKByAliyunIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
