// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTemplateBody extends TeaModel {
    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert template for sustained CPU usage above 80%</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The business-level key-value labels. This is a JSON object string, such as {&quot;env&quot;:&quot;prod&quot;}. The default value is an empty object. An empty string is equivalent to not passing this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prod&quot;}</p>
     */
    @NameInMap("labels")
    public String labels;

    /**
     * <p>The rule configurations. This is a v2 wire JSON object string, and the top level must include datasourceConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;datasourceConfig&quot;:{&quot;type&quot;:&quot;PROMETHEUS&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;},&quot;queryConfig&quot;:{&quot;type&quot;:&quot;PROMQL_QUERY&quot;,&quot;expr&quot;:&quot;up == 0&quot;}}</p>
     */
    @NameInMap("ruleConfigs")
    public String ruleConfigs;

    /**
     * <p>The scenario labels. This is a JSON array string, such as [&quot;Runbook&quot;]. The default value is an empty array. An empty string is equivalent to not passing this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Runbook&quot;]</p>
     */
    @NameInMap("scenes")
    public String scenes;

    /**
     * <p>The schema version of the template. The default value is v2. v1 is rejected by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The enabling status of the template. Valid values: 1: Enabled. 0: Disabled. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-cpu-high-template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    public static AlertRuleTemplateBody build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleTemplateBody self = new AlertRuleTemplateBody();
        return TeaModel.build(map, self);
    }

    public AlertRuleTemplateBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlertRuleTemplateBody setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public AlertRuleTemplateBody setRuleConfigs(String ruleConfigs) {
        this.ruleConfigs = ruleConfigs;
        return this;
    }
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

    public AlertRuleTemplateBody setScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }
    public String getScenes() {
        return this.scenes;
    }

    public AlertRuleTemplateBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public AlertRuleTemplateBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AlertRuleTemplateBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
