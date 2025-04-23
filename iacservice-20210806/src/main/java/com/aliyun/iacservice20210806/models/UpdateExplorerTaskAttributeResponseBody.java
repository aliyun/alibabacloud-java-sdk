// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateExplorerTaskAttributeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateExplorerTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExplorerTaskAttributeResponseBody self = new UpdateExplorerTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExplorerTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
