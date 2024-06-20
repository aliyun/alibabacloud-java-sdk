// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigUdpReflectRequest extends TeaModel {
    /**
     * <p>The configuration of the filtering policy for UDP reflection attacks.</p>
     * <p>The value is a string that consists of a JSON struct. The JSON struct contains the following field:</p>
     * <ul>
     * <li><p><strong>UdpSports</strong>: the source ports of the UDP traffic that you want to block. This field is required and must be of the ARRAY type. Example: <code>[17,19]</code>.</p>
     * <p>We recommend that you block the following source ports of UDP traffic:</p>
     * <ul>
     * <li>UDP 17: QOTD reflection attacks</li>
     * <li>UDP 19: CharGEN reflection attacks</li>
     * <li>UDP 69: TFTP reflection attacks</li>
     * <li>UDP 111: Portmap reflection attacks</li>
     * <li>UDP 123: NTP reflection attacks</li>
     * <li>UDP 137: NetBIOS reflection attacks</li>
     * <li>UDP 161: SNMPv2 reflection attacks</li>
     * <li>UDP 389: CLDAP reflection attacks</li>
     * <li>UDP 1194: OpenVPN reflection attacks</li>
     * <li>UDP 1900: SSDP reflection attacks</li>
     * <li>UDP 3389: RDP reflection attacks</li>
     * <li>UDP 11211: memcached reflection attacks</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;UdpSports\&quot;:[17,19]}</p>
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
     * <p>ddoscoo-cn-i7m25564****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland, which indicates Anti-DDoS Pro instances. This is the default value.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland, which indicates Anti-DDoS Premium instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfigUdpReflectRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigUdpReflectRequest self = new ConfigUdpReflectRequest();
        return TeaModel.build(map, self);
    }

    public ConfigUdpReflectRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigUdpReflectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigUdpReflectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
