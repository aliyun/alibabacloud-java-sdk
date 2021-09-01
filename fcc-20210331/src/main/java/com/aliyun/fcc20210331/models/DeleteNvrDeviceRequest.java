// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteNvrDeviceRequest extends TeaModel {
    @NameInMap("DeviceCodes")
    public String deviceCodes;

    public static DeleteNvrDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNvrDeviceRequest self = new DeleteNvrDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNvrDeviceRequest setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes;
        return this;
    }
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

}
