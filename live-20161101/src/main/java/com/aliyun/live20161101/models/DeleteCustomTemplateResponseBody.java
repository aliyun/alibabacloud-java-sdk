// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateResponseBody self = new DeleteCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
