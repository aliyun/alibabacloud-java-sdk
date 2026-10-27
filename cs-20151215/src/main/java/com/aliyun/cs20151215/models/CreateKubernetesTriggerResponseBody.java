// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponseBody extends TeaModel {
    /**
     * <p>The action of the trigger. For example, <code>redeploy</code>: Redeploys the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>redeploy</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The trigger ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The project name of the trigger.</p>
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
     * <li><code>application</code>: The trigger for applications in Hybrid Cloud Application Center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateKubernetesTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerResponseBody self = new CreateKubernetesTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKubernetesTriggerResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateKubernetesTriggerResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateKubernetesTriggerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateKubernetesTriggerResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateKubernetesTriggerResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
