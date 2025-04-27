// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2463A343-BD32-5803-959E-9A8472A1***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponseBody self = new DeleteResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
