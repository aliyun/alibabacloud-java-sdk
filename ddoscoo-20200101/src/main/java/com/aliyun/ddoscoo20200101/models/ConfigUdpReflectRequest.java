// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigUdpReflectRequest extends TeaModel {
    /**
     * <p>The configuration of the filtering policy for UDP reflection attacks.</p>
     * <br>
     * <p>The value is a string that consists of a JSON struct. The JSON struct contains the following field:</p>
     * <br>
     * <p>*   **UdpSports**: the source ports of the UDP traffic that you want to block. This field is required and must be of the ARRAY type. Example: `[17,19]`.</p>
     * <br>
     * <p>    We recommend that you block the following source ports of UDP traffic:</p>
     * <br>
     * <p>    *   UDP 17: QOTD reflection attacks</p>
     * <p>    *   UDP 19: CharGEN reflection attacks</p>
     * <p>    *   UDP 69: TFTP reflection attacks</p>
     * <p>    *   UDP 111: Portmap reflection attacks</p>
     * <p>    *   UDP 123: NTP reflection attacks</p>
     * <p>    *   UDP 137: NetBIOS reflection attacks</p>
     * <p>    *   UDP 161: SNMPv2 reflection attacks</p>
     * <p>    *   UDP 389: CLDAP reflection attacks</p>
     * <p>    *   UDP 1194: OpenVPN reflection attacks</p>
     * <p>    *   UDP 1900: SSDP reflection attacks</p>
     * <p>    *   UDP 3389: RDP reflection attacks</p>
     * <p>    *   UDP 11211: memcached reflection attacks</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland, which indicates Anti-DDoS Pro instances. This is the default value.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland, which indicates Anti-DDoS Premium instances.</p>
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
