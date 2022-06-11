// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallUserPluginsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static InstallUserPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallUserPluginsRequest self = new InstallUserPluginsRequest();
        return TeaModel.build(map, self);
    }

    public InstallUserPluginsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
