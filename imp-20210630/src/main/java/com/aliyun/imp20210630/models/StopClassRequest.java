// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopClassRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClassId")
    public String classId;

    @NameInMap("UserId")
    public String userId;

    public static StopClassRequest build(java.util.Map<String, ?> map) throws Exception {
        StopClassRequest self = new StopClassRequest();
        return TeaModel.build(map, self);
    }

    public StopClassRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopClassRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public StopClassRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
