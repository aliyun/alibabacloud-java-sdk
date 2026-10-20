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
     * <li><code>deployment</code>: the trigger for stateless applications.</li>
     * <li><code>application</code>: the trigger for Application Center applications.
     * Default value: <code>deployment</code>.
     * If you do not specify the trigger type, the query results are not filtered by trigger type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The trigger action. Valid values:</p>
     * <ul>
     * <li><code>redeploy</code>: Redeploys the resources defined in <code>project_id</code>.
     * If you do not specify the trigger action, the query results are not filtered by trigger action.</li>
     * </ul>
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
