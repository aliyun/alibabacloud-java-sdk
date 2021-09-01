// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RegisterCredentialRequest extends TeaModel {
    @NameInMap("Gid")
    public String gid;

    @NameInMap("DeviceId")
    public String deviceId;

    public static RegisterCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCredentialRequest self = new RegisterCredentialRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCredentialRequest setGid(String gid) {
        this.gid = gid;
        return this;
    }
    public String getGid() {
        return this.gid;
    }

    public RegisterCredentialRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
