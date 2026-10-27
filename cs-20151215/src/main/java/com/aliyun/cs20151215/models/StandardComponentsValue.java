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
     * <p>The description of the component features.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether the component is required for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: The component is required and must be installed when the cluster is created.</p>
     * </li>
     * <li><p>false: The component is not required. You can install it in the Components module after the cluster is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("required")
    public String required;

    /**
     * <p>Specifies whether to disable the default installation of the component. When a cluster is created, components required for the cluster are installed. In addition, some components related to logs or routing, such as Ingress, are installed by default. If you do not want to install these components by default, you can set this parameter to disable the default installation. Valid values:</p>
     * <ul>
     * <li>true: disables the default installation.</li>
     * <li>false: enables the default installation.</li>
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
