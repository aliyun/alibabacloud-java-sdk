// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailByIdRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The region of the certificate. Valid values:</p>
     * <br>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <p>*   **cn-hangzhou**: China (Hangzhou)</p>
     * <br>
     * <p>Default value: **cn-hangzhou**</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCdnCertificateDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailByIdRequest self = new DescribeCdnCertificateDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailByIdRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public DescribeCdnCertificateDetailByIdRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public DescribeCdnCertificateDetailByIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnCertificateDetailByIdRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
