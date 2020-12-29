// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtEagleEyeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("eagleEyeTraceId")
    @Validation(required = true)
    public String eagleEyeTraceId;

    public static FtEagleEyeResponse build(java.util.Map<String, ?> map) throws Exception {
        FtEagleEyeResponse self = new FtEagleEyeResponse();
        return TeaModel.build(map, self);
    }

    public FtEagleEyeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtEagleEyeResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FtEagleEyeResponse setEagleEyeTraceId(String eagleEyeTraceId) {
        this.eagleEyeTraceId = eagleEyeTraceId;
        return this;
    }
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

}
