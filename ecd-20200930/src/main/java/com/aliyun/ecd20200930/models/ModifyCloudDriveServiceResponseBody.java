// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudDriveServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveServiceResponseBody self = new ModifyCloudDriveServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
