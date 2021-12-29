// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetClassDetailRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂唯一标识，由调用CreateClass返回。
    @NameInMap("ClassId")
    public String classId;

    // 操作人用户ID。
    @NameInMap("UserId")
    public String userId;

    public static GetClassDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClassDetailRequest self = new GetClassDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClassDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetClassDetailRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public GetClassDetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
