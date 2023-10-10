// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace name.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The type of trigger. Valid values:</p>
     * <br>
     * <p>*   `deployment`: performs actions on Deployments.</p>
     * <p>*   `application`: performs actions on applications that are deployed in Application Center.</p>
     * <br>
     * <p>Default value: `deployment`.</p>
     * <br>
     * <p>If you do not set this parameter, triggers are not filtered by type.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The action that the trigger performs. Set the value to redeploy.</p>
     * <br>
     * <p>`redeploy`: redeploys the resources specified by `project_id`.</p>
     * <br>
     * <p>If you do not specify this parameter, triggers are not filtered by action.</p>
     */
    @NameInMap("action")
    public String action;

    public static GetKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerRequest self = new GetKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

    public GetKubernetesTriggerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetKubernetesTriggerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetKubernetesTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetKubernetesTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
