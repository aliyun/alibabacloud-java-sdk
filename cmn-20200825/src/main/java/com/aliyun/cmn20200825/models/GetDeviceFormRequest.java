// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceFormRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    public static GetDeviceFormRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceFormRequest self = new GetDeviceFormRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceFormRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

}
