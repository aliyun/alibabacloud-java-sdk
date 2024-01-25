// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class LogoutDeviceRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserSource")
    public String userSource;

    public static LogoutDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        LogoutDeviceRequest self = new LogoutDeviceRequest();
        return TeaModel.build(map, self);
    }

    public LogoutDeviceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public LogoutDeviceRequest setUserSource(String userSource) {
        this.userSource = userSource;
        return this;
    }
    public String getUserSource() {
        return this.userSource;
    }

}
