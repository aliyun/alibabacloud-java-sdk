// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web-server</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li><p><code>deployment</code>: a trigger for a stateless application. </p>
     * </li>
     * <li><p><code>application</code>: a trigger for an application center application.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>deployment</code>.</p>
     * <p>If you do not specify a trigger type, the query results are not filtered by trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The trigger action. Valid values:</p>
     * <p><code>redeploy</code>: redeploys the resources defined in <code>project_id</code>.</p>
     * <p>If you do not specify a trigger action, the query results are not filtered by trigger action.</p>
     * 
     * <strong>example:</strong>
     * <p>redeploy</p>
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
