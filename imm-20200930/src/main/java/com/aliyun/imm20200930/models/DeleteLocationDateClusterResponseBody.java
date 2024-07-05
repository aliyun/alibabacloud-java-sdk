// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteLocationDateClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B121940C-9794-4EE3-8D6E-F8EC525F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLocationDateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocationDateClusterResponseBody self = new DeleteLocationDateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLocationDateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
