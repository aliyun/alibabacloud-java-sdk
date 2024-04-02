// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomOcrTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomOcrTemplateResponseBody self = new UpdateCustomOcrTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomOcrTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
