// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13cbb83e-043c-4728-ac35-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodPackagingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingGroupResponseBody self = new DeleteVodPackagingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
