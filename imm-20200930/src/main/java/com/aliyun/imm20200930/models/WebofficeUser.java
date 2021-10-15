// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficeUser extends TeaModel {
    // 头像
    @NameInMap("Avatar")
    public String avatar;

    // Id
    @NameInMap("Id")
    public String id;

    // 名字
    @NameInMap("Name")
    public String name;

    public static WebofficeUser build(java.util.Map<String, ?> map) throws Exception {
        WebofficeUser self = new WebofficeUser();
        return TeaModel.build(map, self);
    }

    public WebofficeUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public WebofficeUser setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WebofficeUser setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
