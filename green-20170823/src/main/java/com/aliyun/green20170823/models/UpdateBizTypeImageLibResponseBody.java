// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeImageLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBizTypeImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeImageLibResponseBody self = new UpdateBizTypeImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
