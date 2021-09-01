// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAbilityConfigListByDeviceIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static GetAbilityConfigListByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAbilityConfigListByDeviceIdRequest self = new GetAbilityConfigListByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAbilityConfigListByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetAbilityConfigListByDeviceIdRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
