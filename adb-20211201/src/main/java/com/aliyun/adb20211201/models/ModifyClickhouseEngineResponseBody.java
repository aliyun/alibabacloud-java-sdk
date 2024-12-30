// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClickhouseEngineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D761DA51-12F8-5457-AAA9-F52B9F436D2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClickhouseEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClickhouseEngineResponseBody self = new ModifyClickhouseEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClickhouseEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
