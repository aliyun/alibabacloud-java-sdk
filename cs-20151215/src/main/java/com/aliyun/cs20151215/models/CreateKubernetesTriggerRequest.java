// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerRequest extends TeaModel {
    /**
     * <p>The trigger action. Valid values:</p>
     * <p><code>redeploy</code>: redeploys the resources defined in project_id.</p>
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
     * <p>The trigger project name.</p>
     * <p>The value consists of the namespace and application name in the format of <code>${namespace}/${name}</code>.</p>
     * <p>Example: <code>default/test-app</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default/test-app</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li><p><code>deployment</code>: a trigger for stateless applications. </p>
     * </li>
     * <li><p><code>application</code>: a trigger for Application Center applications.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>deployment</code>.</p>
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
