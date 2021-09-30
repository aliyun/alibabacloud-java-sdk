// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopClassRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂唯一标识。
    @NameInMap("ClassId")
    public String classId;

    // 操作者用户ID。
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
