// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReadWritePolicy extends TeaModel {
    @NameInMap("autoGeneratePk")
    public Boolean autoGeneratePk;

    @NameInMap("writeHa")
    public Boolean writeHa;

    @NameInMap("writePolicy")
    public String writePolicy;

    public static ReadWritePolicy build(java.util.Map<String, ?> map) throws Exception {
        ReadWritePolicy self = new ReadWritePolicy();
        return TeaModel.build(map, self);
    }

    public ReadWritePolicy setAutoGeneratePk(Boolean autoGeneratePk) {
        this.autoGeneratePk = autoGeneratePk;
        return this;
    }
    public Boolean getAutoGeneratePk() {
        return this.autoGeneratePk;
    }

    public ReadWritePolicy setWriteHa(Boolean writeHa) {
        this.writeHa = writeHa;
        return this;
    }
    public Boolean getWriteHa() {
        return this.writeHa;
    }

    public ReadWritePolicy setWritePolicy(String writePolicy) {
        this.writePolicy = writePolicy;
        return this;
    }
    public String getWritePolicy() {
        return this.writePolicy;
    }

}
