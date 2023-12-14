// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteUserCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCertificateResponseBody self = new DeleteUserCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
