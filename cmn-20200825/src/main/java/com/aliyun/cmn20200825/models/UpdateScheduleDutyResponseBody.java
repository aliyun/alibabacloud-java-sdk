// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateScheduleDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleDutyResponseBody self = new UpdateScheduleDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
