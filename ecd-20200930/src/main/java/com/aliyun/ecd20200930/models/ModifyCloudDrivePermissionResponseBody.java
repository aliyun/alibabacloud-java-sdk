// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDrivePermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9197824D-AD4B-571F-94BB-C2E6D5855AB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudDrivePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDrivePermissionResponseBody self = new ModifyCloudDrivePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDrivePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
