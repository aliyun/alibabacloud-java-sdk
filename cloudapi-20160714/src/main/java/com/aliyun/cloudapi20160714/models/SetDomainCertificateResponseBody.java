// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainCertificateResponseBody self = new SetDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
