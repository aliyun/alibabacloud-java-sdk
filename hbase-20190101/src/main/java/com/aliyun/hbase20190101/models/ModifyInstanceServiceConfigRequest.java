// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceServiceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase#hbase-site.xml#hbase.client.keyvalue.maxsize</p>
     */
    @NameInMap("ConfigureName")
    public String configureName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10485770</p>
     */
    @NameInMap("ConfigureValue")
    public String configureValue;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1=value1&quot;, &quot;key2=value2&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static ModifyInstanceServiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceServiceConfigRequest self = new ModifyInstanceServiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceServiceConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInstanceServiceConfigRequest setConfigureName(String configureName) {
        this.configureName = configureName;
        return this;
    }
    public String getConfigureName() {
        return this.configureName;
    }

    public ModifyInstanceServiceConfigRequest setConfigureValue(String configureValue) {
        this.configureValue = configureValue;
        return this;
    }
    public String getConfigureValue() {
        return this.configureValue;
    }

    public ModifyInstanceServiceConfigRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyInstanceServiceConfigRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
