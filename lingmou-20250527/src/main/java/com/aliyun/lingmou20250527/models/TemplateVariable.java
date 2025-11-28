// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class TemplateVariable extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("properties")
    public Object properties;

    @NameInMap("type")
    public String type;

    public static TemplateVariable build(java.util.Map<String, ?> map) throws Exception {
        TemplateVariable self = new TemplateVariable();
        return TeaModel.build(map, self);
    }

    public TemplateVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TemplateVariable setProperties(Object properties) {
        this.properties = properties;
        return this;
    }
    public Object getProperties() {
        return this.properties;
    }

    public TemplateVariable setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
