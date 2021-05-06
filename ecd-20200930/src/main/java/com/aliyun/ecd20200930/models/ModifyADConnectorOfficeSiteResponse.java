// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyADConnectorOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorOfficeSiteResponse self = new ModifyADConnectorOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorOfficeSiteResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
