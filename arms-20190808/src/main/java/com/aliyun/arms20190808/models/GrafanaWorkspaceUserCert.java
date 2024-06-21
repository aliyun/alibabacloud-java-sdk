// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceUserCert extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8096753</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>cert-7700050 [grafana.tongtong-max.cn]</p>
     */
    @NameInMap("name")
    public String name;

    public static GrafanaWorkspaceUserCert build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceUserCert self = new GrafanaWorkspaceUserCert();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceUserCert setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GrafanaWorkspaceUserCert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
