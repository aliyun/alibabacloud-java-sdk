// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FraudResultCallBackRequest extends TeaModel {
    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("VerifyDeployEnv")
    public String verifyDeployEnv;

    public static FraudResultCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        FraudResultCallBackRequest self = new FraudResultCallBackRequest();
        return TeaModel.build(map, self);
    }

    public FraudResultCallBackRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public FraudResultCallBackRequest setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FraudResultCallBackRequest setVerifyDeployEnv(String verifyDeployEnv) {
        this.verifyDeployEnv = verifyDeployEnv;
        return this;
    }
    public String getVerifyDeployEnv() {
        return this.verifyDeployEnv;
    }

}
