// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class VendorConfig extends TeaModel {
    @NameInMap("meteringConfig")
    public MeteringConfig meteringConfig;

    public static VendorConfig build(java.util.Map<String, ?> map) throws Exception {
        VendorConfig self = new VendorConfig();
        return TeaModel.build(map, self);
    }

    public VendorConfig setMeteringConfig(MeteringConfig meteringConfig) {
        this.meteringConfig = meteringConfig;
        return this;
    }
    public MeteringConfig getMeteringConfig() {
        return this.meteringConfig;
    }

}
