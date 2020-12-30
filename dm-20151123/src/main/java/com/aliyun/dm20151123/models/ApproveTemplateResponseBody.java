// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveTemplateResponseBody self = new ApproveTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
