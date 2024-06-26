// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetPublicAntChainCertificateRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static ResetPublicAntChainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetPublicAntChainCertificateRequest self = new ResetPublicAntChainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ResetPublicAntChainCertificateRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
