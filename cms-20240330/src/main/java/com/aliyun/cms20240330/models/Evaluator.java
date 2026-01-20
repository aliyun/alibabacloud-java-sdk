// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Evaluator extends TeaModel {
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    @NameInMap("dataScope")
    public String dataScope;

    @NameInMap("filters")
    public java.util.Map<String, String> filters;

    @NameInMap("name")
    public String name;

    @NameInMap("resultName")
    public String resultName;

    @NameInMap("resultType")
    public String resultType;

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

    public Evaluator setDataScope(String dataScope) {
        this.dataScope = dataScope;
        return this;
    }
    public String getDataScope() {
        return this.dataScope;
    }

    public Evaluator setFilters(java.util.Map<String, String> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, String> getFilters() {
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

    public Evaluator setVariableMapping(java.util.Map<String, String> variableMapping) {
        this.variableMapping = variableMapping;
        return this;
    }
    public java.util.Map<String, String> getVariableMapping() {
        return this.variableMapping;
    }

}
