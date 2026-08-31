// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class EvaluatorVariableExtractorMappingValue extends TeaModel {
    /**
     * <p>The evaluation data field from which content is extracted. The extraction expression is applied to the content of this field. Required when saving with the evaluation task. For the trial run API, this parameter can be omitted and the backend derives it from the expression. Multiple variables can share the same source field.</p>
     * 
     * <strong>example:</strong>
     * <p>trace.output</p>
     */
    @NameInMap("originField")
    public String originField;

    /**
     * <p>The extraction method. jsonpath extracts values from the JSON content of the field by using JSONPath. regex performs regular expression matching on the full text of the field. When capturing groups are present, the first capturing group is returned. When no capturing group is present, the entire match is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>jsonpath</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The extraction expression. Its meaning is determined by type. When type is jsonpath, specify a JSONPath expression. You can use either a relative path relative to originField (such as $.order.expected) or an absolute path from the root (such as $trace.output.order.expected). When type is regex, specify a regular expression. Note that backslashes must be escaped in JSON. The expression syntax is validated upon saving. For regular expressions, RE2 compatibility is additionally validated. Patterns such as lookahead assertions, lookbehind assertions, backreferences, named groups, atomic groups, and possessive quantifiers are rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>$.order.expected</p>
     */
    @NameInMap("expression")
    public String expression;

    public static EvaluatorVariableExtractorMappingValue build(java.util.Map<String, ?> map) throws Exception {
        EvaluatorVariableExtractorMappingValue self = new EvaluatorVariableExtractorMappingValue();
        return TeaModel.build(map, self);
    }

    public EvaluatorVariableExtractorMappingValue setOriginField(String originField) {
        this.originField = originField;
        return this;
    }
    public String getOriginField() {
        return this.originField;
    }

    public EvaluatorVariableExtractorMappingValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EvaluatorVariableExtractorMappingValue setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

}
