// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Subtype")
    public Integer subtype;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateRequest self = new CreateCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomTemplateRequest setSubtype(Integer subtype) {
        this.subtype = subtype;
        return this;
    }
    public Integer getSubtype() {
        return this.subtype;
    }

    public CreateCustomTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public CreateCustomTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
