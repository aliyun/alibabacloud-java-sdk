// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ResumeSingleCardShrinkRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("OptMsisdns")
    public String optMsisdnsShrink;

    public static ResumeSingleCardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeSingleCardShrinkRequest self = new ResumeSingleCardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResumeSingleCardShrinkRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public ResumeSingleCardShrinkRequest setOptMsisdnsShrink(String optMsisdnsShrink) {
        this.optMsisdnsShrink = optMsisdnsShrink;
        return this;
    }
    public String getOptMsisdnsShrink() {
        return this.optMsisdnsShrink;
    }

}
