// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D2E005C4-8CA3-5F1D-9917-E75BE3BF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudDriveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveUsersResponseBody self = new ModifyCloudDriveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
