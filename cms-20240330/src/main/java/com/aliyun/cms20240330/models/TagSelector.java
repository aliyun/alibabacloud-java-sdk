// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TagSelector extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<TagCondition> conditions;

    @NameInMap("expression")
    public String expression;

    @NameInMap("relation")
    public String relation;

    public static TagSelector build(java.util.Map<String, ?> map) throws Exception {
        TagSelector self = new TagSelector();
        return TeaModel.build(map, self);
    }

    public TagSelector setConditions(java.util.List<TagCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<TagCondition> getConditions() {
        return this.conditions;
    }

    public TagSelector setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public TagSelector setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

}
