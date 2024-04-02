// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditCallbackRequest extends TeaModel {
    @NameInMap("Callback")
    public String callback;

    @NameInMap("CryptType")
    public Integer cryptType;

    @NameInMap("Seed")
    public String seed;

    public static UpdateAuditCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditCallbackRequest self = new UpdateAuditCallbackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditCallbackRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public UpdateAuditCallbackRequest setCryptType(Integer cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public Integer getCryptType() {
        return this.cryptType;
    }

    public UpdateAuditCallbackRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

}
