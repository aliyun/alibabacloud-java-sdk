// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateClassRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CreateNickname")
    public String createNickname;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("Title")
    public String title;

    public static CreateClassRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClassRequest self = new CreateClassRequest();
        return TeaModel.build(map, self);
    }

    public CreateClassRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateClassRequest setCreateNickname(String createNickname) {
        this.createNickname = createNickname;
        return this;
    }
    public String getCreateNickname() {
        return this.createNickname;
    }

    public CreateClassRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public CreateClassRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
