// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Conversation extends TeaModel {
    @NameInMap("CreatedAt")
    public Long createdAt;

    @NameInMap("Id")
    public String id;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static Conversation build(java.util.Map<String, ?> map) throws Exception {
        Conversation self = new Conversation();
        return TeaModel.build(map, self);
    }

    public Conversation setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Conversation setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Conversation setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Conversation setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
