// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyADConnectorDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorDirectoryResponse self = new ModifyADConnectorDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
