// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CollectionAccountInfoDTO extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("IsActive")
    public Boolean isActive;

    @NameInMap("IsConfigured")
    public Boolean isConfigured;

    public static CollectionAccountInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        CollectionAccountInfoDTO self = new CollectionAccountInfoDTO();
        return TeaModel.build(map, self);
    }

    public CollectionAccountInfoDTO setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CollectionAccountInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
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

}
