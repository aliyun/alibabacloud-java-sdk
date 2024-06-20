// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricConsortiumDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    public static CheckFabricConsortiumDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricConsortiumDomainRequest self = new CheckFabricConsortiumDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckFabricConsortiumDomainRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}
