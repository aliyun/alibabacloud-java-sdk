// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class DeleteTrailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrailResponseBody self = new DeleteTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
