// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetRealPersonVerificationResultRequest extends TeaModel {
    @NameInMap("MaterialHash")
    public String materialHash;

    @NameInMap("VerificationToken")
    public String verificationToken;

    public static GetRealPersonVerificationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealPersonVerificationResultRequest self = new GetRealPersonVerificationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetRealPersonVerificationResultRequest setMaterialHash(String materialHash) {
        this.materialHash = materialHash;
        return this;
    }
    public String getMaterialHash() {
        return this.materialHash;
    }

    public GetRealPersonVerificationResultRequest setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }
    public String getVerificationToken() {
        return this.verificationToken;
    }

}
