// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16A78396-936F-5481-91D7-591BF7981246</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MoveResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupResponseBody self = new MoveResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
