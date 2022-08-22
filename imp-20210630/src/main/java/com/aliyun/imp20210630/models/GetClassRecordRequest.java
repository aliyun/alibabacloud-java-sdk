// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetClassRecordRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClassId")
    public String classId;

    @NameInMap("UserId")
    public String userId;

    public static GetClassRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClassRecordRequest self = new GetClassRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetClassRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetClassRecordRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public GetClassRecordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
