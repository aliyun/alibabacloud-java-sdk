// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class TransferResellerToUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static TransferResellerToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferResellerToUserResponseBody self = new TransferResellerToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferResellerToUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TransferResellerToUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public TransferResellerToUserResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TransferResellerToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
