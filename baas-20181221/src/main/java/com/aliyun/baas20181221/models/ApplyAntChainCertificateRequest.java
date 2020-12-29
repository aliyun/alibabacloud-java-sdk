// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("UploadReq")
    public String uploadReq;

    public static ApplyAntChainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateRequest self = new ApplyAntChainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ApplyAntChainCertificateRequest setUploadReq(String uploadReq) {
        this.uploadReq = uploadReq;
        return this;
    }
    public String getUploadReq() {
        return this.uploadReq;
    }

}
