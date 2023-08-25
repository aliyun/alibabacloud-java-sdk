// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressSpecRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **200** to **1000**.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    public static ModifyAnycastEipAddressSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressSpecRequest self = new ModifyAnycastEipAddressSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressSpecRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ModifyAnycastEipAddressSpecRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

}
