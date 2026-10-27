// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerRequest extends TeaModel {
    /**
     * <p>The action of the trigger. Valid values:</p>
     * <ul>
     * <li><code>redeploy</code>: Redeploys the resources defined in <code>project_id</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>redeploy</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The project name of the trigger. It consists of the namespace and the name of the application, in the format of <code>${namespace}/${name}</code>. Example: <code>default/test-app</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default/test-app</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <ul>
     * <li><code>deployment</code>: The trigger for stateless applications.</li>
     * <li><code>application</code>: The trigger for applications in Hybrid Cloud Application Center.
     * Default value: <code>deployment</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerRequest self = new CreateKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateKubernetesTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateKubernetesTriggerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateKubernetesTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateKubernetesTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
