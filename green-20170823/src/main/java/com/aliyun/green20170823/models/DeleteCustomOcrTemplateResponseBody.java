// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomOcrTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomOcrTemplateResponseBody self = new DeleteCustomOcrTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomOcrTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
