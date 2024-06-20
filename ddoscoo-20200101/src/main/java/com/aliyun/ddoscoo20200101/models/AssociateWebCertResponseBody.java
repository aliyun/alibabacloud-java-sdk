// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40F11005-A75C-4644-95F2-52A4E7D43E91</p>
     */
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
