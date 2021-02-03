// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static MoveGtmResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveGtmResourceGroupResponse self = new MoveGtmResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveGtmResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
