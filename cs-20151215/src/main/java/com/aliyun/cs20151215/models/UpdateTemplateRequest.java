// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the deployment template.</p>
     * 
     * <strong>example:</strong>
     * <p>web server cluster</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the deployment template.</p>
     * 
     * <strong>example:</strong>
     * <p>webserver01</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The tags of the deployment template.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>The template content in YAML format.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: apps/v1\\nkind: Deployment\\nmetadata:\\n  name: nginx-deployment-basic\\n  labels:\\n    app: nginx\\nspec:\\n  replicas: 2\\n  selector:\\n    matchLabels:\\n      app: nginx\\n  template:\\n    metadata:\\n      labels:\\n        app: nginx\\n    spec:\\n      containers:\\n      - name: nginx\\n        image: busybox:latest\\n        ports:\\n        - containerPort: 8080</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><p>If you set this parameter to <code>kubernetes</code>, the template is displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * <li><p>If you leave this parameter empty or set it to other values, the template is not displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * </ul>
     * <p>Settings this parameter to <code>kubernetes</code> is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTemplateRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
