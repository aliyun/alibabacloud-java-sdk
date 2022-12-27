// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerRequest extends TeaModel {
    // The domain name of which you want to verify the ownership. You can specify only one domain name.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The verification method. Valid values:
    // 
    // *   **dnsCheck**: by DNS record
    // *   **fileCheck**: by verification file
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerRequest self = new VerifyDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyDomainOwnerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
