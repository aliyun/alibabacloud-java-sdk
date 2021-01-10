// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyBuiltinFunctionTemplateRequest extends TeaModel {
    @NameInMap("BuiltinFunctionTemplateId")
    public String builtinFunctionTemplateId;

    @NameInMap("Status")
    public String status;

    public static VerifyBuiltinFunctionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBuiltinFunctionTemplateRequest self = new VerifyBuiltinFunctionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBuiltinFunctionTemplateRequest setBuiltinFunctionTemplateId(String builtinFunctionTemplateId) {
        this.builtinFunctionTemplateId = builtinFunctionTemplateId;
        return this;
    }
    public String getBuiltinFunctionTemplateId() {
        return this.builtinFunctionTemplateId;
    }

    public VerifyBuiltinFunctionTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
