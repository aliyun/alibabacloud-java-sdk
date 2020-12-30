// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveMailTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveMailTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveMailTemplateResponseBody self = new ApproveMailTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveMailTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
