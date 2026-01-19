// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountRoleDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCloudAccountRoleDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountRoleDescriptionResponseBody self = new UpdateCloudAccountRoleDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountRoleDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
