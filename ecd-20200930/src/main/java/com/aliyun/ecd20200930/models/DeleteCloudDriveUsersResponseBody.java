// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCloudDriveUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudDriveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudDriveUsersResponseBody self = new DeleteCloudDriveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudDriveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
