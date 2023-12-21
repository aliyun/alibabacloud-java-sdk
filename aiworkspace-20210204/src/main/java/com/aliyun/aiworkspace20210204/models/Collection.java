// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Collection extends TeaModel {
    @NameInMap("CollectionName")
    public String collectionName;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("UserId")
    public String userId;

    public static Collection build(java.util.Map<String, ?> map) throws Exception {
        Collection self = new Collection();
        return TeaModel.build(map, self);
    }

    public Collection setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

    public Collection setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Collection setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Collection setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Collection setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
