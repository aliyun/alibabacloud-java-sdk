// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class VerifyIotCardRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    public static VerifyIotCardRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIotCardRequest self = new VerifyIotCardRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIotCardRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
