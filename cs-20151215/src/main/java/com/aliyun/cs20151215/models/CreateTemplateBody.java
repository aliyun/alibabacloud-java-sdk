// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTemplateBody extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("template")
    @Validation(required = true)
    public String template;

    @NameInMap("tags")
    public String tags;

    @NameInMap("template_type")
    public String templateType;

    public static CreateTemplateBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateBody self = new CreateTemplateBody();
        return TeaModel.build(map, self);
    }

}
