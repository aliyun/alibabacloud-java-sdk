// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StandardComponentsValue extends TeaModel {
    /**
     * <p>The name of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-arena</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The description of the component.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the component is a required component. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The component is required and must be installed when a cluster is created.</li>
     * <li><code>false</code>: The component is optional. After a cluster is created, you can go to the <code>Add-ons</code> page to install the component.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("required")
    public String required;

    /**
     * <p>Indicates whether the automatic installation of the component is disabled. By default, some optional components, such as components for logging and Ingresses, are installed when a cluster is created. You can set this parameter to disable automatic component installation. Valid values:</p>
     * <ul>
     * <li><code>true</code>: disables automatic component installation.</li>
     * <li><code>false</code>: enables automatic component installation.</li>
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
