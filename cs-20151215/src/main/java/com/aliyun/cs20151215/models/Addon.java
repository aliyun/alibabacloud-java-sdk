// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Addon extends TeaModel {
    /**
     * <p>The configuration of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;IngressSlbNetworkType\&quot;:\&quot;internet\&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>Specifies whether to disable automatic installation. When you create a cluster, some additional log components are automatically installed in addition to the required components. You can disable the automatic installations of a component and install the component later by calling the component API or in the corresponding console. Valid values:</p>
     * <ul>
     * <li><code>true</code>: disables the automatic installation of a component.</li>
     * <li><code>false</code>: allows the automatic installation of a component.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disabled")
    public Boolean disabled;

    /**
     * <p>The component name.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx-ingress-controller</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.9.3-aliyun.1</p>
     */
    @NameInMap("version")
    public String version;

    public static Addon build(java.util.Map<String, ?> map) throws Exception {
        Addon self = new Addon();
        return TeaModel.build(map, self);
    }

    public Addon setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public Addon setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public Addon setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Addon setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
