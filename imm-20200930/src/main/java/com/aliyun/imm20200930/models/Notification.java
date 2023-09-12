// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Notification extends TeaModel {
    @NameInMap("ExtendedMessageURI")
    public String extendedMessageURI;

    @NameInMap("MNS")
    public MNS MNS;

    @NameInMap("RocketMQ")
    public RocketMQ rocketMQ;

    public static Notification build(java.util.Map<String, ?> map) throws Exception {
        Notification self = new Notification();
        return TeaModel.build(map, self);
    }

    public Notification setExtendedMessageURI(String extendedMessageURI) {
        this.extendedMessageURI = extendedMessageURI;
        return this;
    }
    public String getExtendedMessageURI() {
        return this.extendedMessageURI;
    }

    public Notification setMNS(MNS MNS) {
        this.MNS = MNS;
        return this;
    }
    public MNS getMNS() {
        return this.MNS;
    }

    public Notification setRocketMQ(RocketMQ rocketMQ) {
        this.rocketMQ = rocketMQ;
        return this;
    }
    public RocketMQ getRocketMQ() {
        return this.rocketMQ;
    }

}
