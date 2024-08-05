// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDomainCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE5722A6-AE78-4741-A9B0-6C817D360510</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainCertificateResponseBody self = new DeleteDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
