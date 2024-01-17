// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAllTrafficSpecialControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAllTrafficSpecialControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllTrafficSpecialControlResponseBody self = new DeleteAllTrafficSpecialControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAllTrafficSpecialControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
