// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainByCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The public key of the SSL certificate. You must Base64-encode the public key before you invoke the encodeURIComponent function to encode a URI component. The public key must be in the PEM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    /**
     * <p>Specifies whether to return only domain names with HTTPS enabled or disabled.</p>
     * <ul>
     * <li><strong>true</strong>: returns only domain names with HTTPS enabled.</li>
     * <li><strong>false</strong>: The rule is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeLiveDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainByCertificateRequest self = new DescribeLiveDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainByCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainByCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainByCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public DescribeLiveDomainByCertificateRequest setSSLStatus(Boolean SSLStatus) {
        this.SSLStatus = SSLStatus;
        return this;
    }
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

}
