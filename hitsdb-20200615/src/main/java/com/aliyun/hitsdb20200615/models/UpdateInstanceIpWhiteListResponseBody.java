// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceIpWhiteListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceIpWhiteListResponseBody self = new UpdateInstanceIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
