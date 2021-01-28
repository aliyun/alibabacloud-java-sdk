// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetDcdnDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainCertificateResponseBody self = new BatchSetDcdnDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
