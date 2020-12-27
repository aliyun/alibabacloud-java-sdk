// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtEagleEyeResponseBody extends TeaModel {
    @NameInMap("eagleEyeTraceId")
    public String eagleEyeTraceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    public static FtEagleEyeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtEagleEyeResponseBody self = new FtEagleEyeResponseBody();
        return TeaModel.build(map, self);
    }

    public FtEagleEyeResponseBody setEagleEyeTraceId(String eagleEyeTraceId) {
        this.eagleEyeTraceId = eagleEyeTraceId;
        return this;
    }
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

    public FtEagleEyeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtEagleEyeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
