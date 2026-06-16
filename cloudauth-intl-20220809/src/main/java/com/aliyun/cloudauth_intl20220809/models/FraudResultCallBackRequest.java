// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FraudResultCallBackRequest extends TeaModel {
    /**
     * <p>The unique identifier for identity verification, which corresponds to the verifyId of Ant.</p>
     * 
     * <strong>example:</strong>
     * <p>shs2b27333914876c01de4cb22f5841f</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>The extended parameters, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtParams")
    public String extParams;

    /**
     * <p>Indicates whether the anti-spoofing check is passed. Valid values:</p>
     * <ul>
     * <li>PASS: Passed.</li>
     * <li>REJECT: Not passed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <p>The environment routing parameter. Valid values:</p>
     * <ul>
     * <li>staging: staging environment</li>
     * <li>production: production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
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

    public FraudResultCallBackRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
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
