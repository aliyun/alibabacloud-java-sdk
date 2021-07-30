// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitHotlineTransferRegisterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitHotlineTransferRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotlineTransferRegisterResponseBody self = new SubmitHotlineTransferRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitHotlineTransferRegisterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitHotlineTransferRegisterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitHotlineTransferRegisterResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public SubmitHotlineTransferRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
