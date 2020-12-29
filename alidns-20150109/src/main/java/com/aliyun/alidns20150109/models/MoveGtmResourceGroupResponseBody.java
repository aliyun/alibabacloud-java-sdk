// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MoveGtmResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveGtmResourceGroupResponseBody self = new MoveGtmResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveGtmResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
