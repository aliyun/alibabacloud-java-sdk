// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionWhiteDevicesByDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static AddVersionWhiteDevicesByDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVersionWhiteDevicesByDeviceGroupsResponseBody self = new AddVersionWhiteDevicesByDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
