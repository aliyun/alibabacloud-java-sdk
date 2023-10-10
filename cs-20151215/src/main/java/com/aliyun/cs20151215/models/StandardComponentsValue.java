// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StandardComponentsValue extends TeaModel {
    /**
     * <p>The name of the component.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version of the component.</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The description of the component.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the component is a required component. Valid values:</p>
     * <br>
     * <p>*   `true`: The component is required and must be installed when a cluster is created.</p>
     * <p>*   `false`: The component is optional. After a cluster is created, you can go to the `Add-ons` page to install the component.</p>
     */
    @NameInMap("required")
    public String required;

    /**
     * <p>Indicates whether the automatic installation of the component is disabled. By default, some optional components, such as components for logging and Ingresses, are installed when a cluster is created. You can set this parameter to disable automatic component installation. Valid values:</p>
     * <br>
     * <p>*   `true`: disables automatic component installation.</p>
     * <p>*   `false`: enables automatic component installation.</p>
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
