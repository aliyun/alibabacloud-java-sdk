// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteClassRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClassId")
    public String classId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteClassRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClassRequest self = new DeleteClassRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClassRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteClassRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public DeleteClassRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
