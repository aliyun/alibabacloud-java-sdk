// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    /**
     * <strong>example:</strong>
     * <p>{&quot;svc1&quot;:&quot;svc2&quot;}</p>
     */
    @NameInMap("serviceNameChanges")
    public java.util.Map<String, String> serviceNameChanges;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>start-springboot</p>
     */
    @NameInMap("templateName")
    public String templateName;

    @NameInMap("variableValues")
    public TemplateVariableValueMap variableValues;

    public static TemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        TemplateConfig self = new TemplateConfig();
        return TeaModel.build(map, self);
    }

    public TemplateConfig setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public TemplateConfig setServiceNameChanges(java.util.Map<String, String> serviceNameChanges) {
        this.serviceNameChanges = serviceNameChanges;
        return this;
    }
    public java.util.Map<String, String> getServiceNameChanges() {
        return this.serviceNameChanges;
    }

    public TemplateConfig setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateConfig setVariableValues(TemplateVariableValueMap variableValues) {
        this.variableValues = variableValues;
        return this;
    }
    public TemplateVariableValueMap getVariableValues() {
        return this.variableValues;
    }

}
