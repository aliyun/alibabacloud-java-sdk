// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAbilityDetailByDeviceIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Id")
    public String id;

    public static GetAbilityDetailByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAbilityDetailByDeviceIdRequest self = new GetAbilityDetailByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAbilityDetailByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetAbilityDetailByDeviceIdRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetAbilityDetailByDeviceIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
