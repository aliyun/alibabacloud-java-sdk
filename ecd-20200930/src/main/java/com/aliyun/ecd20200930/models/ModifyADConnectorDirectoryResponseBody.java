// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyADConnectorDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorDirectoryResponseBody self = new ModifyADConnectorDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
