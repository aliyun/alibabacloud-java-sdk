// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateClassRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂唯一标识。
    @NameInMap("ClassId")
    public String classId;

    // 创建人用户昵称，1~32个字符。
    @NameInMap("CreateNickname")
    public String createNickname;

    // 创建人用户ID，仅支持中英文数字，下划线，中划线，1~36个字符。
    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("RegionId")
    public String regionId;

    // 课堂标题，1~32个字符。
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

    public UpdateClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateClassRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
