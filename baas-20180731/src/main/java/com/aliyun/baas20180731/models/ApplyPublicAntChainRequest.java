// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyPublicAntChainRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("UploadReq")
    public String uploadReq;

    public static ApplyPublicAntChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPublicAntChainRequest self = new ApplyPublicAntChainRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPublicAntChainRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ApplyPublicAntChainRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ApplyPublicAntChainRequest setUploadReq(String uploadReq) {
        this.uploadReq = uploadReq;
        return this;
    }
    public String getUploadReq() {
        return this.uploadReq;
    }

}
