// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class LaunchFlowRequest extends TeaModel {
    @NameInMap("FlowDesc")
    public String flowDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-6a3acc07d51541b0b836</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    /**
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public Integer flowVersion;

    public static LaunchFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchFlowRequest self = new LaunchFlowRequest();
        return TeaModel.build(map, self);
    }

    public LaunchFlowRequest setFlowDesc(String flowDesc) {
        this.flowDesc = flowDesc;
        return this;
    }
    public String getFlowDesc() {
        return this.flowDesc;
    }

    public LaunchFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public LaunchFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public LaunchFlowRequest setFlowTemplate(String flowTemplate) {
        this.flowTemplate = flowTemplate;
        return this;
    }
    public String getFlowTemplate() {
        return this.flowTemplate;
    }

    public LaunchFlowRequest setFlowVersion(Integer flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

}
