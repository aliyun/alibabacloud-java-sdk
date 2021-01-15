// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceId")
    public String deviceId;

    // 查询日期，格式 yyyy-MM-dd
    @NameInMap("Date")
    public String date;

    public static GetDeviceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigRequest self = new GetDeviceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
