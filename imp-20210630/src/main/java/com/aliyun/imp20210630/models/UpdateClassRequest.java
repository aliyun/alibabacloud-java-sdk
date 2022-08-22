// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateClassRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClassId")
    public String classId;

    @NameInMap("CreateNickname")
    public String createNickname;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("Title")
    public String title;

    public static UpdateClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClassRequest self = new UpdateClassRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClassRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateClassRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public UpdateClassRequest setCreateNickname(String createNickname) {
        this.createNickname = createNickname;
        return this;
    }
    public String getCreateNickname() {
        return this.createNickname;
    }

    public UpdateClassRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public UpdateClassRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
