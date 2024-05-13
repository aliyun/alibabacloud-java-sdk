// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    /**
     * <p>The action that the trigger performs. Set the value to redeploy.</p>
     * <br>
     * <p>`redeploy`: redeploys the resources specified by `project_id`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The name of the trigger project.</p>
     * <br>
     * <p>The name consists of the namespace where the application is deployed and the name of the application. The format is `${namespace}/${name}`.</p>
     * <br>
     * <p>Example: `default/test-app`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <p>The type of trigger. Valid values:</p>
     * <br>
     * <p>*   `deployment`: performs actions on Deployments.</p>
     * <p>*   `application`: performs actions on applications that are deployed in Application Center.</p>
     * <br>
     * <p>Default value: `deployment`.</p>
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
