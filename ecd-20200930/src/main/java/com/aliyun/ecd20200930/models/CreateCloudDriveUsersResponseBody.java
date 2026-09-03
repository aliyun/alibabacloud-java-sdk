// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveUsersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05F0A7AE-17F1-53DF-BD99-ABF936FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudDriveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveUsersResponseBody self = new CreateCloudDriveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
