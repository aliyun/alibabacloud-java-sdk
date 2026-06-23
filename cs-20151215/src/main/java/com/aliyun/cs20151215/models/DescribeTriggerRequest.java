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
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li><p><code>deployment</code>: a trigger for a stateless application. </p>
     * </li>
     * <li><p><code>application</code>: a trigger for an application in Open Applications.</p>
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
     * <p><code>redeploy</code>: redeploys the application.</p>
     * <p>If you do not specify a trigger action, the query results are not filtered by trigger action.</p>
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
