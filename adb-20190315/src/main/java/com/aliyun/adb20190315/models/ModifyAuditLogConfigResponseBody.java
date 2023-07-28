// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the status of SQL audit is updated. Valid values:</p>
     * <br>
     * <p>*   **true**: The status of SQL audit is updated.</p>
     * <p>*   **false**: The status of SQL audit is not updated.</p>
     */
    @NameInMap("UpdateSucceed")
    public Boolean updateSucceed;

    public static ModifyAuditLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogConfigResponseBody self = new ModifyAuditLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAuditLogConfigResponseBody setUpdateSucceed(Boolean updateSucceed) {
        this.updateSucceed = updateSucceed;
        return this;
    }
    public Boolean getUpdateSucceed() {
        return this.updateSucceed;
    }

}
