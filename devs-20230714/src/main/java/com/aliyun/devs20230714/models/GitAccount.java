// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GitAccount extends TeaModel {
    @NameInMap("avatar")
    public String avatar;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("uri")
    public String uri;

    public static GitAccount build(java.util.Map<String, ?> map) throws Exception {
        GitAccount self = new GitAccount();
        return TeaModel.build(map, self);
    }

    public GitAccount setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public GitAccount setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GitAccount setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GitAccount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GitAccount setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
