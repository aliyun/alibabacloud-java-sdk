// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ReleaseAgAccountRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("ReleaseReason")
    public String releaseReason;

    public static ReleaseAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAgAccountRequest self = new ReleaseAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAgAccountRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ReleaseAgAccountRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ReleaseAgAccountRequest setReleaseReason(String releaseReason) {
        this.releaseReason = releaseReason;
        return this;
    }
    public String getReleaseReason() {
        return this.releaseReason;
    }

}
