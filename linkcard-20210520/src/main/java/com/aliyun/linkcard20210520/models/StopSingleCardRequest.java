// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class StopSingleCardRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OptMsisdns")
    public java.util.Map<String, ?> optMsisdns;

    public static StopSingleCardRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSingleCardRequest self = new StopSingleCardRequest();
        return TeaModel.build(map, self);
    }

    public StopSingleCardRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public StopSingleCardRequest setOptMsisdns(java.util.Map<String, ?> optMsisdns) {
        this.optMsisdns = optMsisdns;
        return this;
    }
    public java.util.Map<String, ?> getOptMsisdns() {
        return this.optMsisdns;
    }

}
