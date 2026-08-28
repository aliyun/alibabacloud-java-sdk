// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ShareCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23279004</p>
     */
    @NameInMap("CertificateId")
    public Long certificateId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1622883344556677</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static ShareCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareCertificateRequest self = new ShareCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ShareCertificateRequest setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

    public ShareCertificateRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

}
