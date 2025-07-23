// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-vj30bil8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of IP addresses that you want to configure in the whitelist. Separate multiple IP addresses with spaces or commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18.68.XX.XX,18.68.XX.XX</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static ConfigInstanceWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhitelistRequest self = new ConfigInstanceWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceWhitelistRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
