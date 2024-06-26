// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetCertificateRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static ResetCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetCertificateRequest self = new ResetCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ResetCertificateRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
