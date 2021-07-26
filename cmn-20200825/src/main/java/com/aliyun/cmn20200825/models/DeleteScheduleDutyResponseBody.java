// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduleDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleDutyResponseBody self = new DeleteScheduleDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
