// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySyncJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5AD3D9DF-614F-5B97-9522-A2406A432012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySyncJobResponseBody self = new ModifySyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
