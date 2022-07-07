// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CollectionAccountInfoDTO extends TeaModel {
    // 收款模式
    @NameInMap("CollectionMode")
    public String collectionMode;

    // 是否开启
    @NameInMap("IsActive")
    public Boolean isActive;

    // 是否配置
    @NameInMap("IsConfigured")
    public Boolean isConfigured;

    // 创建时间
    @NameInMap("gmtCreate")
    public String gmtCreate;

    public static CollectionAccountInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        CollectionAccountInfoDTO self = new CollectionAccountInfoDTO();
        return TeaModel.build(map, self);
    }

    public CollectionAccountInfoDTO setCollectionMode(String collectionMode) {
        this.collectionMode = collectionMode;
        return this;
    }
    public String getCollectionMode() {
        return this.collectionMode;
    }

    public CollectionAccountInfoDTO setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    public Boolean getIsActive() {
        return this.isActive;
    }

    public CollectionAccountInfoDTO setIsConfigured(Boolean isConfigured) {
        this.isConfigured = isConfigured;
        return this;
    }
    public Boolean getIsConfigured() {
        return this.isConfigured;
    }

    public CollectionAccountInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

}
