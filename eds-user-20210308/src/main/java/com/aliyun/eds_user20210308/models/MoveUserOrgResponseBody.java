// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class MoveUserOrgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MoveUserOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveUserOrgResponseBody self = new MoveUserOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveUserOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
