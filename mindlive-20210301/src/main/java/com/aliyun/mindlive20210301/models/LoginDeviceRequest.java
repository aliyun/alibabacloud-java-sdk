// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class LoginDeviceRequest extends TeaModel {
    @NameInMap("UserSource")
    public String userSource;

    @NameInMap("UserId")
    public String userId;

    public static LoginDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginDeviceRequest self = new LoginDeviceRequest();
        return TeaModel.build(map, self);
    }

    public LoginDeviceRequest setUserSource(String userSource) {
        this.userSource = userSource;
        return this;
    }
    public String getUserSource() {
        return this.userSource;
    }

    public LoginDeviceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
