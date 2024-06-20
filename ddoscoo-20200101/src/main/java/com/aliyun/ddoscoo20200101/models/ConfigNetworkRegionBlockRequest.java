// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockRequest extends TeaModel {
    /**
     * <p>The details of the configurations of blocked locations. This parameter is a JSON string. The value consists of the following fields:</p>
     * <ul>
     * <li><p><strong>RegionBlockSwitch</strong>: the status of the Location Blacklist policy. This field is required and must be of the string type. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the policy.</li>
     * <li><strong>off</strong>: disables the policy.</li>
     * </ul>
     * </li>
     * <li><p><strong>Countries</strong>: the codes of the countries or areas from which you want to block requests. This field is optional and must be of the array type.</p>
     * <p>**</p>
     * <p><strong>Note</strong>For more information, see the <strong>Codes of countries and areas</strong> section of the <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a> topic.</p>
     * </li>
     * <li><p><strong>Provinces</strong>: the codes of the administrative regions in China from which you want to block requests. This field is optional and must be of the array type.</p>
     * <p>**</p>
     * <p><strong>Note</strong>For more information, see the <strong>Codes of administrative regions in China</strong> section of the <a href="https://help.aliyun.com/document_detail/167926.html">Codes of administrative regions in China and codes of countries and areas</a> topic.</p>
     * <p>For example, <code>[11,12]</code> specifies Beijing and Tianjin.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RegionBlockSwitch&quot;:&quot;off&quot;,&quot;Countries&quot;:[],&quot;Provinces&quot;:[11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigNetworkRegionBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockRequest self = new ConfigNetworkRegionBlockRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigNetworkRegionBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
