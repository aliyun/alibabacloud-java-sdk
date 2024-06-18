// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteUserDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDevicesResponseBody self = new DeleteUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
