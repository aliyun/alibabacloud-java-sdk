// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateResponseBody self = new DeleteSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
