// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class EntityMediaBasicInfo extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityMediaId")
    public String entityMediaId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserData")
    public String userData;

    public static EntityMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        EntityMediaBasicInfo self = new EntityMediaBasicInfo();
        return TeaModel.build(map, self);
    }

    public EntityMediaBasicInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EntityMediaBasicInfo setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public EntityMediaBasicInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public EntityMediaBasicInfo setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public EntityMediaBasicInfo setEntityMediaId(String entityMediaId) {
        this.entityMediaId = entityMediaId;
        return this;
    }
    public String getEntityMediaId() {
        return this.entityMediaId;
    }

    public EntityMediaBasicInfo setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public EntityMediaBasicInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public EntityMediaBasicInfo setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
