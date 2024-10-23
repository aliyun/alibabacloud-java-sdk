// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the status of SQL audit is updated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The status of SQL audit is updated.</li>
     * <li><strong>false</strong>: The status of SQL audit is not updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
