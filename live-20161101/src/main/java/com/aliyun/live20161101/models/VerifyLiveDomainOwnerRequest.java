// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class VerifyLiveDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to verify the ownership. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The verification method. Valid values:</p>
     * <ul>
     * <li>dnsCheck: DNS record verification</li>
     * <li>fileCheck: file verification</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dnsCheck</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyLiveDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyLiveDomainOwnerRequest self = new VerifyLiveDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyLiveDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyLiveDomainOwnerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyLiveDomainOwnerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyLiveDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
