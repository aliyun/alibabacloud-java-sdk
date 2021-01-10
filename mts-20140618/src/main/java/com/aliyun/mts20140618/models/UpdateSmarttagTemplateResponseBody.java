// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateSmarttagTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmarttagTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmarttagTemplateResponseBody self = new UpdateSmarttagTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmarttagTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
