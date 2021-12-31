// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DeleteFingerPrintTemplateResponseBody extends TeaModel {
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
