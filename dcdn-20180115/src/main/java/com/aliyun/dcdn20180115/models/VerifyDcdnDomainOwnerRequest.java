// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class VerifyDcdnDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name of which you want to verify the ownership. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The verification method, value:</p>
     * <br>
     * <p>*   dnsCheck: DNS verification</p>
     * <p>*   fileCheck: File verification</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyDcdnDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDcdnDomainOwnerRequest self = new VerifyDcdnDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDcdnDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyDcdnDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
