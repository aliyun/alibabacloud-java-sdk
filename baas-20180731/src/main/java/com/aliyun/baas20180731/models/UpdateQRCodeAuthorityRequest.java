// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateQRCodeAuthorityRequest extends TeaModel {
    @NameInMap("Authorized")
    public Boolean authorized;

    @NameInMap("Bizid")
    public String bizid;

    public static UpdateQRCodeAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQRCodeAuthorityRequest self = new UpdateQRCodeAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQRCodeAuthorityRequest setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public UpdateQRCodeAuthorityRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
