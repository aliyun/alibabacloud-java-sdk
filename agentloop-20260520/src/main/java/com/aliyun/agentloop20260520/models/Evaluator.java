// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class Evaluator extends TeaModel {
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    @NameInMap("evaluatorRef")
    public String evaluatorRef;

    @NameInMap("filters")
    public java.util.Map<String, ?> filters;

    @NameInMap("name")
    public String name;

    @NameInMap("resultName")
    public String resultName;

    @NameInMap("resultType")
    public String resultType;

    @NameInMap("type")
    public String type;

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
