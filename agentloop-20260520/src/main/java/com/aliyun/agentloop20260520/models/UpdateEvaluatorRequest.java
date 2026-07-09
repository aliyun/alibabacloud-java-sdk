// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorRequest extends TeaModel {
    /**
     * <p>The list of annotation marks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;__en&quot;]</p>
     */
    @NameInMap("annotations")
    public java.util.List<String> annotations;

    /**
     * <p>The new version configuration. This parameter is typically required when <code>version</code> is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt&quot;:&quot;请更严格地评估任务完成度&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The evaluator description.</p>
     * 
     * <strong>example:</strong>
     * <p>判断 Agent 是否完成用户任务</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>链路任务完成度</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The evaluator properties.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The new version number. If specified, a new version is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>优化评分说明</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateEvaluatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorRequest self = new UpdateEvaluatorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorRequest setAnnotations(java.util.List<String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    public UpdateEvaluatorRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateEvaluatorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEvaluatorRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateEvaluatorRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public UpdateEvaluatorRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateEvaluatorRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public UpdateEvaluatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
