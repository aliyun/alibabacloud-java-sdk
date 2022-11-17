// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class Bod extends TeaModel {
    @NameInMap("Step")
    public byte[] step;

    public static Bod build(java.util.Map<String, ?> map) throws Exception {
        Bod self = new Bod();
        return TeaModel.build(map, self);
    }

    public Bod setStep(byte[] step) {
        this.step = step;
        return this;
    }
    public byte[] getStep() {
        return this.step;
    }

}
