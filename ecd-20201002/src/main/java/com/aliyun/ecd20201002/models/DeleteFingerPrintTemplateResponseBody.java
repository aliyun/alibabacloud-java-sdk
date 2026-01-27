// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DeleteFingerPrintTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>134BD0B2-B848-5743-9CE2-C1FD3D5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFingerPrintTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFingerPrintTemplateResponseBody self = new DeleteFingerPrintTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFingerPrintTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
