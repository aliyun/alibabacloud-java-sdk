// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class RebindResumeSingleCardRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OptMsisdns")
    public java.util.Map<String, ?> optMsisdns;

    public static RebindResumeSingleCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RebindResumeSingleCardRequest self = new RebindResumeSingleCardRequest();
        return TeaModel.build(map, self);
    }

    public RebindResumeSingleCardRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public RebindResumeSingleCardRequest setOptMsisdns(java.util.Map<String, ?> optMsisdns) {
        this.optMsisdns = optMsisdns;
        return this;
    }
    public java.util.Map<String, ?> getOptMsisdns() {
        return this.optMsisdns;
    }

}
