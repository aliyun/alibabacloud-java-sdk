// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RenderServicesByTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("projectName")
    public String projectName;

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

    public static RenderServicesByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderServicesByTemplateRequest self = new RenderServicesByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public RenderServicesByTemplateRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public RenderServicesByTemplateRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RenderServicesByTemplateRequest setServiceNameChanges(java.util.Map<String, String> serviceNameChanges) {
        this.serviceNameChanges = serviceNameChanges;
        return this;
    }
    public java.util.Map<String, String> getServiceNameChanges() {
        return this.serviceNameChanges;
    }

    public RenderServicesByTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public RenderServicesByTemplateRequest setVariableValues(TemplateVariableValueMap variableValues) {
        this.variableValues = variableValues;
        return this;
    }
    public TemplateVariableValueMap getVariableValues() {
        return this.variableValues;
    }

}
