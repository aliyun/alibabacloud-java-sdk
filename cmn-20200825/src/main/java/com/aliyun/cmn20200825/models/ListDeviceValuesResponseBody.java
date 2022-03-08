// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceValuesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DeviceValues")
    public java.util.List<String> deviceValues;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceValuesResponseBody self = new ListDeviceValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceValuesResponseBody setDeviceValues(java.util.List<String> deviceValues) {
        this.deviceValues = deviceValues;
        return this;
    }
    public java.util.List<String> getDeviceValues() {
        return this.deviceValues;
    }

    public ListDeviceValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
