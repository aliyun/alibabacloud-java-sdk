// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockRequest extends TeaModel {
    /**
     * <p>The configuration of the location blacklist, expressed as a JSON string with the following structure:</p>
     * <ul>
     * <li><p><strong>RegionBlockSwitch</strong>: String type. Required. The switch status of the location blacklist. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled</li>
     * </ul>
     * </li>
     * <li><p><strong>Countries</strong>: Array type. Optional. The list of international region codes to block.</p>
     * <blockquote>
     * <p>For more information about international region codes, see <a href="https://help.aliyun.com/document_detail/167926.html">Parameters for China and international regions</a>.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>Provinces</strong>: Array type. Optional. The list of China region codes to block.</p>
     * <blockquote>
     * <p>For more information about China region codes, see <a href="https://help.aliyun.com/document_detail/167926.html">Parameters for China and international regions</a>.</p>
     * </blockquote>
     * <p>  For example, <code>[11,12]</code> indicates Beijing and Tianjin.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RegionBlockSwitch&quot;:&quot;on&quot;,&quot;Countries&quot;:[],&quot;Provinces&quot;:[11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
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
