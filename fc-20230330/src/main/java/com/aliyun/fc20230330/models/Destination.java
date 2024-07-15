// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Destination extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:xxx:functions/f1</p>
     */
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
