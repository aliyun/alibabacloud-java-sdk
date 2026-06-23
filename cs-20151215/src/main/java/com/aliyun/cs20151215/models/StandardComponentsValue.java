// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StandardComponentsValue extends TeaModel {
    /**
     * <p>The component name.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-arena</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The component version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The description of the component features.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the component is required by the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The component is required and must be installed when the cluster is created.</p>
     * </li>
     * <li><p><code>false</code>: The component is optional and can be installed through Component Management after the cluster is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("required")
    public String required;

    /**
     * <p>Indicates whether default installation is disabled. When a cluster is created, in addition to the components required by the cluster, some logging or routing-related components (such as Ingress) are also installed by default. If you do not want to install them by default, you can set this field to disable default installation. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Default installation is disabled.</li>
     * <li><code>false</code>: Default installation is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disabled")
    public Boolean disabled;

    public static StandardComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        StandardComponentsValue self = new StandardComponentsValue();
        return TeaModel.build(map, self);
    }

    public StandardComponentsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StandardComponentsValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public StandardComponentsValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StandardComponentsValue setRequired(String required) {
        this.required = required;
        return this;
    }
    public String getRequired() {
        return this.required;
    }

    public StandardComponentsValue setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

}
