// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Addon extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;IngressSlbNetworkType&quot;:&quot;internet&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disabled")
    public Boolean disabled;

    /**
     * <strong>example:</strong>
     * <p>nginx-ingress-controller</p>
     */
    @NameInMap("name")
    public String name;

    /**
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
