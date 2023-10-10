// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponseBody extends TeaModel {
    /**
     * <p>The action that the trigger performs. For example, a value of `redeploy` indicates that the trigger redeploys the application.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The ID of the trigger.</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The name of the trigger project.</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <p>The type of trigger.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   `deployment`: performs actions on Deployments.</p>
     * <p>*   `application`: performs actions on applications that are deployed in Application Center.</p>
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
