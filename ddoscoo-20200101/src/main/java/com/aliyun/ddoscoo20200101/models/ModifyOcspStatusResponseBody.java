// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyOcspStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOcspStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOcspStatusResponseBody self = new ModifyOcspStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOcspStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
