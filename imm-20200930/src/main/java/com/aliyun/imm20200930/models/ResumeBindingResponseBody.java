// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ResumeBindingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeBindingResponseBody self = new ResumeBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
