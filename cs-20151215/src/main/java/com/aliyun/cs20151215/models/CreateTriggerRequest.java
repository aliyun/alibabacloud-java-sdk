// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
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
     * <p>The project name of the trigger.</p>
     * <p>It consists of the namespace and the name of the application, in the format of <code>${namespace}/${name}</code>.</p>
     * <p>Example: <code>default/test-app</code>.</p>
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
     * <li><p><code>deployment</code>: The trigger for stateless applications. </p>
     * </li>
     * <li><p><code>application</code>: The trigger for Application Center applications.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>deployment</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateTriggerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
