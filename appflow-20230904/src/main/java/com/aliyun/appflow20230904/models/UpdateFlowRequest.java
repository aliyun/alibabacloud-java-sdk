// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class UpdateFlowRequest extends TeaModel {
    /**
     * <p>Specifies whether the connection flow is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The description of the connection flow.</p>
     * 
     * <strong>example:</strong>
     * <p>新建流程</p>
     */
    @NameInMap("FlowDesc")
    public String flowDesc;

    /**
     * <p>The ID of the connection flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-15550241a1e942c29835</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The name of the connection flow.</p>
     * 
     * <strong>example:</strong>
     * <p>新建流程</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The template of the connection flow.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;FormatVersion&quot;: &quot;appflow-2025-07-01&quot;,
     *   &quot;Nodes&quot;: [</p>
     * <pre><code> ]
     * </code></pre>
     * <p>}</p>
     */
    @NameInMap("FlowTemplate")
    public String flowTemplate;

    /**
     * <p>The version of the connection flow.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    public static UpdateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRequest self = new UpdateFlowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateFlowRequest setFlowDesc(String flowDesc) {
        this.flowDesc = flowDesc;
        return this;
    }
    public String getFlowDesc() {
        return this.flowDesc;
    }

    public UpdateFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public UpdateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateFlowRequest setFlowTemplate(String flowTemplate) {
        this.flowTemplate = flowTemplate;
        return this;
    }
    public String getFlowTemplate() {
        return this.flowTemplate;
    }

    public UpdateFlowRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

}
