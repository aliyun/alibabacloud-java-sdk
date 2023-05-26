// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceOrg extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    public static GrafanaWorkspaceOrg build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceOrg self = new GrafanaWorkspaceOrg();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceOrg setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceOrg setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
