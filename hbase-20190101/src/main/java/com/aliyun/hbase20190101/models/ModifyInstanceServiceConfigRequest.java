// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceServiceConfigRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The name of the configuration item to modify. You can call the <a href="https://help.aliyun.com/document_detail/201980.html">ListInstanceServiceConfigurations</a> operation to query the configuration item name.
     * &lt;props=&quot;intl&quot;&gt;The name of the configuration item to modify.</p>
     * <blockquote>
     * <p>If you want to modify multiple configuration items, specify the Parameters parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase#hbase-site.xml#hbase.client.keyvalue.maxsize</p>
     */
    @NameInMap("ConfigureName")
    public String configureName;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The value of the configuration item to modify. You can call the <a href="https://help.aliyun.com/document_detail/201980.html">ListInstanceServiceConfigurations</a> operation to query the configuration item value.
     * &lt;props=&quot;intl&quot;&gt;The value of the configuration item to modify.</p>
     * <blockquote>
     * <p>If you want to modify multiple configuration items, specify the Parameters parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10485770</p>
     */
    @NameInMap("ConfigureValue")
    public String configureValue;

    /**
     * <p>The JSON-formatted parameters for modifying multiple configuration items. The key specifies the name of the configuration item, and the value specifies the value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1=value1&quot;, &quot;key2=value2&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>Specifies whether to restart the instance after the configuration is modified. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Restart the instance.</li>
     * <li><strong>false</strong>: Do not restart the instance.</li>
     * </ul>
     * 
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
