// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyBuiltinFunctionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyBuiltinFunctionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyBuiltinFunctionTemplateResponseBody self = new VerifyBuiltinFunctionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyBuiltinFunctionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
