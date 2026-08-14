// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateWebCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateWebCertResponseBody self = new AssociateWebCertResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateWebCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
