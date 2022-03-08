// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDateResponseBody extends TeaModel {
    // 设备配置变化日期
    @NameInMap("DeviceConfigDate")
    public java.util.List<String> deviceConfigDate;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceConfigDateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDateResponseBody self = new GetDeviceConfigDateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDateResponseBody setDeviceConfigDate(java.util.List<String> deviceConfigDate) {
        this.deviceConfigDate = deviceConfigDate;
        return this;
    }
    public java.util.List<String> getDeviceConfigDate() {
        return this.deviceConfigDate;
    }

    public GetDeviceConfigDateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
