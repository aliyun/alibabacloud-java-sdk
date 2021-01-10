// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ReleaseBuiltinFunctionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseBuiltinFunctionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBuiltinFunctionTemplateResponseBody self = new ReleaseBuiltinFunctionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseBuiltinFunctionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
