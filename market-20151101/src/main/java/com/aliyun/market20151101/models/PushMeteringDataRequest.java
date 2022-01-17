// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushMeteringDataRequest extends TeaModel {
    @NameInMap("Metering")
    public String metering;

    public static PushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataRequest self = new PushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataRequest setMetering(String metering) {
        this.metering = metering;
        return this;
    }
    public String getMetering() {
        return this.metering;
    }

}
