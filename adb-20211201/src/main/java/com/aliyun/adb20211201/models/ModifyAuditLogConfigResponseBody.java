// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDC59E56-BD07-56CA-A05F-B7907DE5C862</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the SQL audit logging status is updated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The status is updated.</li>
     * <li><strong>false</strong>: The status failed to be updated.</li>
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
