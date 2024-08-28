// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReinstallTenantAddonResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Addon prometheus_discovery is successfully reinstalled</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReinstallTenantAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReinstallTenantAddonResponseBody self = new ReinstallTenantAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public ReinstallTenantAddonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReinstallTenantAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
