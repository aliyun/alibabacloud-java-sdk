// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TagSelector extends TeaModel {
    /**
     * <p>The list of label filter conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<TagCondition> conditions;

    /**
     * <p>The custom expression in advanced mode, which overwrites conditions and relation.</p>
     * 
     * <strong>example:</strong>
     * <p>env=prod AND region=cn-hangzhou</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>The condition relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
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
