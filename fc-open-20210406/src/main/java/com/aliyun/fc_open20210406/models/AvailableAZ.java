// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class AvailableAZ extends TeaModel {
    // az
    @NameInMap("availableAZs")
    public String availableAZs;

    public static AvailableAZ build(java.util.Map<String, ?> map) throws Exception {
        AvailableAZ self = new AvailableAZ();
        return TeaModel.build(map, self);
    }

    public AvailableAZ setAvailableAZs(String availableAZs) {
        this.availableAZs = availableAZs;
        return this;
    }
    public String getAvailableAZs() {
        return this.availableAZs;
    }

}
