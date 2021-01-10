// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateBuiltinFunctionTemplateRequest extends TeaModel {
    @NameInMap("BuiltinFunctionTemplateCategoryId")
    public String builtinFunctionTemplateCategoryId;

    public static CreateBuiltinFunctionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBuiltinFunctionTemplateRequest self = new CreateBuiltinFunctionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateBuiltinFunctionTemplateRequest setBuiltinFunctionTemplateCategoryId(String builtinFunctionTemplateCategoryId) {
        this.builtinFunctionTemplateCategoryId = builtinFunctionTemplateCategoryId;
        return this;
    }
    public String getBuiltinFunctionTemplateCategoryId() {
        return this.builtinFunctionTemplateCategoryId;
    }

}
