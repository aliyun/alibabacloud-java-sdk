// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveBuiltinFunctionTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuiltinFunctionTemplateId")
    public String builtinFunctionTemplateId;

    public static SaveBuiltinFunctionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBuiltinFunctionTemplateResponseBody self = new SaveBuiltinFunctionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBuiltinFunctionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBuiltinFunctionTemplateResponseBody setBuiltinFunctionTemplateId(String builtinFunctionTemplateId) {
        this.builtinFunctionTemplateId = builtinFunctionTemplateId;
        return this;
    }
    public String getBuiltinFunctionTemplateId() {
        return this.builtinFunctionTemplateId;
    }

}
