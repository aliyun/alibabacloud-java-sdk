// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7EFA2BA6-9C0A-4410-B735-FC337EB634A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkResponseBody self = new ModifyInstanceRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
