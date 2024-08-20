// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainSMCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnDomainSMCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainSMCertificateResponseBody self = new SetDcdnDomainSMCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainSMCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
