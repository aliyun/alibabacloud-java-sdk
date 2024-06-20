// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortResponseBody self = new ModifyPortResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
