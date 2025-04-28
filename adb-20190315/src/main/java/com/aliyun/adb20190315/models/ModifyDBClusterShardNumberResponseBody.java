// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBClusterShardNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>25B56BC7-4978-40B3-9E48-4B7067******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterShardNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterShardNumberResponseBody self = new ModifyDBClusterShardNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterShardNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
