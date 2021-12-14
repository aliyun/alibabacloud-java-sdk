// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class GetLast400MangerIdentifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLast400MangerIdentifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLast400MangerIdentifyResponseBody self = new GetLast400MangerIdentifyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLast400MangerIdentifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLast400MangerIdentifyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLast400MangerIdentifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
