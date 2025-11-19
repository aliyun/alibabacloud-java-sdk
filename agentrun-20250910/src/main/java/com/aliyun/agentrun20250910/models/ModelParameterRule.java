// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelParameterRule extends TeaModel {
    @NameInMap("default")
    public Object _default;

    @NameInMap("max")
    public Integer max;

    @NameInMap("min")
    public Integer min;

    @NameInMap("name")
    public String name;

    @NameInMap("required")
    public Boolean required;

    @NameInMap("type")
    public String type;

    public static ModelParameterRule build(java.util.Map<String, ?> map) throws Exception {
        ModelParameterRule self = new ModelParameterRule();
        return TeaModel.build(map, self);
    }

    public ModelParameterRule set_default(Object _default) {
        this._default = _default;
        return this;
    }
    public Object get_default() {
        return this._default;
    }

    public ModelParameterRule setMax(Integer max) {
        this.max = max;
        return this;
    }
    public Integer getMax() {
        return this.max;
    }

    public ModelParameterRule setMin(Integer min) {
        this.min = min;
        return this;
    }
    public Integer getMin() {
        return this.min;
    }

    public ModelParameterRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelParameterRule setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ModelParameterRule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
