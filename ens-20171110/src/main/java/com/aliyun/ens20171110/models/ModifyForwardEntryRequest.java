// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryRequest extends TeaModel {
    /**
     * <p>The ID of the DNAT entry.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The name of the DNAT entry. The name must be 2 to 128 characters in length. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The probe port. The port must be within the internal port range. By default, this parameter is left empty.</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    public static ModifyForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryRequest self = new ModifyForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public ModifyForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public ModifyForwardEntryRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

}
