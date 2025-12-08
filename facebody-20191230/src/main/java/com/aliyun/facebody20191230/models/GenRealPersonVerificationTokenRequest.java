// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenRealPersonVerificationTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33010219001123123X</p>
     */
    @NameInMap("CertificateNumber")
    public String certificateNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dwe&quot;:&quot;ew4e&quot;...}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    public static GenRealPersonVerificationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenRealPersonVerificationTokenRequest self = new GenRealPersonVerificationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenRealPersonVerificationTokenRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public GenRealPersonVerificationTokenRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public GenRealPersonVerificationTokenRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

}
