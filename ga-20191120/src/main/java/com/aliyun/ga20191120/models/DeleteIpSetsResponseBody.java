// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B49B60F6-F6C8-49E5-B06B-E33E3A469A92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetsResponseBody self = new DeleteIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
