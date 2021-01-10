// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveBuiltinFunctionTemplateRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BuiltinFunctionTemplateCategoryId")
    public String builtinFunctionTemplateCategoryId;

    @NameInMap("BuiltinFunctionTemplateProfile")
    public String builtinFunctionTemplateProfile;

    public static SaveBuiltinFunctionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBuiltinFunctionTemplateRequest self = new SaveBuiltinFunctionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBuiltinFunctionTemplateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveBuiltinFunctionTemplateRequest setBuiltinFunctionTemplateCategoryId(String builtinFunctionTemplateCategoryId) {
        this.builtinFunctionTemplateCategoryId = builtinFunctionTemplateCategoryId;
        return this;
    }
    public String getBuiltinFunctionTemplateCategoryId() {
        return this.builtinFunctionTemplateCategoryId;
    }

    public SaveBuiltinFunctionTemplateRequest setBuiltinFunctionTemplateProfile(String builtinFunctionTemplateProfile) {
        this.builtinFunctionTemplateProfile = builtinFunctionTemplateProfile;
        return this;
    }
    public String getBuiltinFunctionTemplateProfile() {
        return this.builtinFunctionTemplateProfile;
    }

}
