// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ApproveSmsTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveSmsTemplateResponseBody self = new ApproveSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
