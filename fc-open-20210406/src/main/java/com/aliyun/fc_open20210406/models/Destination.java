// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Destination extends TeaModel {
    // destination
    @NameInMap("destination")
    public String destination;

    public static Destination build(java.util.Map<String, ?> map) throws Exception {
        Destination self = new Destination();
        return TeaModel.build(map, self);
    }

    public Destination setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

}
