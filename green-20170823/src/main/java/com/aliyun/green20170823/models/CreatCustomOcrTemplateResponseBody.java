// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreatCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatCustomOcrTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatCustomOcrTemplateResponseBody self = new CreatCustomOcrTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatCustomOcrTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
