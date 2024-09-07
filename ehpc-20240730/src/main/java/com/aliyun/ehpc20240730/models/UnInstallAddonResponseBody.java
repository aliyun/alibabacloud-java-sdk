// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UnInstallAddonResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnInstallAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnInstallAddonResponseBody self = new UnInstallAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public UnInstallAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
