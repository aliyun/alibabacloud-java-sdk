// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTriggerRequest extends TeaModel {
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
     * <p>The namespace to which the application belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The type of trigger. Valid values:</p>
     * <ul>
     * <li><code>deployment</code>: performs actions on Deployments.</li>
     * <li><code>application</code>: performs actions on applications that are deployed in Application Center.</li>
     * </ul>
     * <p>Default value: <code>deployment</code>.</p>
     * <p>If you do not set this parameter, triggers are not filtered by type.</p>
     * 
     * <strong>example:</strong>
     * <p>deployment</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The action that the trigger performs. Set the value to redeploy.</p>
     * <p><code>redeploy</code>: redeploys the resources specified by <code>project_id</code>.</p>
     * <p>If you do not specify this parameter, triggers are not filtered by action.</p>
     * 
     * <strong>example:</strong>
     * <p>redeploy</p>
     */
    @NameInMap("action")
    public String action;

    public static DescribeTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTriggerRequest self = new DescribeTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTriggerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTriggerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
