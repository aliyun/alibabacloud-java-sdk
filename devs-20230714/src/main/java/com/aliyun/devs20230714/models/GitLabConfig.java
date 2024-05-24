// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GitLabConfig extends TeaModel {
    @NameInMap("token")
    public String token;

    @NameInMap("uri")
    public String uri;

    public static GitLabConfig build(java.util.Map<String, ?> map) throws Exception {
        GitLabConfig self = new GitLabConfig();
        return TeaModel.build(map, self);
    }

    public GitLabConfig setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GitLabConfig setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
