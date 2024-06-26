// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckConsortiumDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    public static CheckConsortiumDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckConsortiumDomainRequest self = new CheckConsortiumDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckConsortiumDomainRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
