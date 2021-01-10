// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteSmarttagTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmarttagTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmarttagTemplateResponseBody self = new DeleteSmarttagTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmarttagTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
