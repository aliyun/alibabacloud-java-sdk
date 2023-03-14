// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardRealStatusShrinkRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Msisdn")
    public String msisdn;

    @NameInMap("SerialNo")
    public String serialNoShrink;

    public static GetCardRealStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardRealStatusShrinkRequest self = new GetCardRealStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCardRealStatusShrinkRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetCardRealStatusShrinkRequest setMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }
    public String getMsisdn() {
        return this.msisdn;
    }

    public GetCardRealStatusShrinkRequest setSerialNoShrink(String serialNoShrink) {
        this.serialNoShrink = serialNoShrink;
        return this;
    }
    public String getSerialNoShrink() {
        return this.serialNoShrink;
    }

}
