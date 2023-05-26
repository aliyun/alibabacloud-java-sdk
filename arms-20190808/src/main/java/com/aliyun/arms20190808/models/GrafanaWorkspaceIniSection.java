// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIniSection extends TeaModel {
    @NameInMap("propertys")
    public java.util.List<GrafanaWorkspaceIniProperty> propertys;

    @NameInMap("section")
    public String section;

    public static GrafanaWorkspaceIniSection build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIniSection self = new GrafanaWorkspaceIniSection();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIniSection setPropertys(java.util.List<GrafanaWorkspaceIniProperty> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<GrafanaWorkspaceIniProperty> getPropertys() {
        return this.propertys;
    }

    public GrafanaWorkspaceIniSection setSection(String section) {
        this.section = section;
        return this;
    }
    public String getSection() {
        return this.section;
    }

}
