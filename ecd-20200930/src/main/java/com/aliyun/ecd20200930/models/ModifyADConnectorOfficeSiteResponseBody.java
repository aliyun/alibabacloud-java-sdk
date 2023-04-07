// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyADConnectorOfficeSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorOfficeSiteResponseBody self = new ModifyADConnectorOfficeSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorOfficeSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
