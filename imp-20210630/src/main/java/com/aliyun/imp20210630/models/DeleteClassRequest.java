// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteClassRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂唯一标识。
    @NameInMap("ClassId")
    public String classId;

    // 操作人用户ID，仅支持中英文数字，下划线，中划线，1~36个字符。
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
