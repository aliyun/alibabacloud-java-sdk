// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C51D9340-4604-5331-AE62-407F3B408F86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupsResponseBody self = new DeleteDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
