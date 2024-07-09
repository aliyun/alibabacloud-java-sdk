// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name of which you want to verify the ownership. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The verification method. Valid values:</p>
     * <ul>
     * <li><strong>dnsCheck</strong>: by DNS record</li>
     * <li><strong>fileCheck</strong>: by verification file</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dnsCheck</p>
     */
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

    public VerifyDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}
