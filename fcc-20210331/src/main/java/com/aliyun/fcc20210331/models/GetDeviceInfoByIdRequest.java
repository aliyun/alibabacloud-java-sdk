// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetDeviceInfoByIdRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvId")
    public String isvId;

    public static GetDeviceInfoByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoByIdRequest self = new GetDeviceInfoByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoByIdRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceInfoByIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetDeviceInfoByIdRequest setIsvId(String isvId) {
        this.isvId = isvId;
        return this;
    }
    public String getIsvId() {
        return this.isvId;
    }

}
