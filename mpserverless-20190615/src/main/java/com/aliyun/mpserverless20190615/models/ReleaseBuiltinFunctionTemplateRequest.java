// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ReleaseBuiltinFunctionTemplateRequest extends TeaModel {
    @NameInMap("BuiltinFunctionTemplateId")
    public String builtinFunctionTemplateId;

    public static ReleaseBuiltinFunctionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBuiltinFunctionTemplateRequest self = new ReleaseBuiltinFunctionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseBuiltinFunctionTemplateRequest setBuiltinFunctionTemplateId(String builtinFunctionTemplateId) {
        this.builtinFunctionTemplateId = builtinFunctionTemplateId;
        return this;
    }
    public String getBuiltinFunctionTemplateId() {
        return this.builtinFunctionTemplateId;
    }

}
