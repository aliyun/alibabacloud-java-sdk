// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Apply400ManagerIdentifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static Apply400ManagerIdentifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Apply400ManagerIdentifyResponseBody self = new Apply400ManagerIdentifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Apply400ManagerIdentifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Apply400ManagerIdentifyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Apply400ManagerIdentifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
