// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class Evaluator extends TeaModel {
    /**
     * <p>The evaluator runtime configuration. For inline LLM evaluators, this must include configurations such as prompt. When referencing an existing evaluator, this parameter is typically not required and is only specified when runtime parameters such as version need to be set.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;1.0.0&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The reference name of a registered evaluator. When specified, the evaluator definition is loaded by this reference with higher priority. Both built-in evaluators and custom evaluators are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Builtin.agent_task_completion</p>
     */
    @NameInMap("evaluatorRef")
    public String evaluatorRef;

    /**
     * <p>The evaluator-level data filter conditions. These take effect together with the task-level dataFilter.query.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot;&quot;}</p>
     */
    @NameInMap("filters")
    public java.util.Map<String, ?> filters;

    /**
     * <p>The evaluator name. Required for inline evaluators when evaluatorRef is not specified. The evaluatorRef or name must be unique within the same task.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_task_completion</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The field name for the evaluation result. Required for inline evaluators. When referencing an existing evaluator, the metricName defined in the evaluator definition is used if this parameter is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_task_completion</p>
     */
    @NameInMap("resultName")
    public String resultName;

    /**
     * <p>The evaluation result type. Required for inline evaluators. Defaults to score when referencing an existing evaluator and this parameter is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>score</p>
     */
    @NameInMap("resultType")
    public String resultType;

    /**
     * <p>The evaluator type. Defaults to LLM if not specified. Inline CODE evaluators are currently not supported. For CODE type evaluators, reference a previously created evaluator by using evaluatorRef.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The variable mapping that maps evaluator variables to evaluation data fields. Required for LLM/AGENT inline evaluators. When referencing an existing evaluator, the variable names must exist in the evaluator definition.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}</p>
     */
    @NameInMap("variableMapping")
    public java.util.Map<String, String> variableMapping;

    public static Evaluator build(java.util.Map<String, ?> map) throws Exception {
        Evaluator self = new Evaluator();
        return TeaModel.build(map, self);
    }

    public Evaluator setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public Evaluator setEvaluatorRef(String evaluatorRef) {
        this.evaluatorRef = evaluatorRef;
        return this;
    }
    public String getEvaluatorRef() {
        return this.evaluatorRef;
    }

    public Evaluator setFilters(java.util.Map<String, ?> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    public Evaluator setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Evaluator setResultName(String resultName) {
        this.resultName = resultName;
        return this;
    }
    public String getResultName() {
        return this.resultName;
    }

    public Evaluator setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public Evaluator setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Evaluator setVariableMapping(java.util.Map<String, String> variableMapping) {
        this.variableMapping = variableMapping;
        return this;
    }
    public java.util.Map<String, String> getVariableMapping() {
        return this.variableMapping;
    }

}
