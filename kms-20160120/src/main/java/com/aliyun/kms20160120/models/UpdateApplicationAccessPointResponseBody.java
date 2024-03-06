// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateApplicationAccessPointResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAccessPointResponseBody self = new UpdateApplicationAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
