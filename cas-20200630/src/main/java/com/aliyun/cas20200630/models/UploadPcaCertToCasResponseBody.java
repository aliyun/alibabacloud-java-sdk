// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UploadPcaCertToCasResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadPcaCertToCasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadPcaCertToCasResponseBody self = new UploadPcaCertToCasResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadPcaCertToCasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
