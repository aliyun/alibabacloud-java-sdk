// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressSpecRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeip-bp1ix34fralt4ykf3****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>200</strong> to <strong>1000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
