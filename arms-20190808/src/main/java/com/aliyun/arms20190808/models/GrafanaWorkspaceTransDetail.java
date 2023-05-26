// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceTransDetail extends TeaModel {
    @NameInMap("dashboardAmount")
    public Integer dashboardAmount;

    @NameInMap("dataSourceAmount")
    public Integer dataSourceAmount;

    @NameInMap("original")
    public Long original;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("target")
    public Long target;

    @NameInMap("targetName")
    public String targetName;

    public static GrafanaWorkspaceTransDetail build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceTransDetail self = new GrafanaWorkspaceTransDetail();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceTransDetail setDashboardAmount(Integer dashboardAmount) {
        this.dashboardAmount = dashboardAmount;
        return this;
    }
    public Integer getDashboardAmount() {
        return this.dashboardAmount;
    }

    public GrafanaWorkspaceTransDetail setDataSourceAmount(Integer dataSourceAmount) {
        this.dataSourceAmount = dataSourceAmount;
        return this;
    }
    public Integer getDataSourceAmount() {
        return this.dataSourceAmount;
    }

    public GrafanaWorkspaceTransDetail setOriginal(Long original) {
        this.original = original;
        return this;
    }
    public Long getOriginal() {
        return this.original;
    }

    public GrafanaWorkspaceTransDetail setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public GrafanaWorkspaceTransDetail setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public GrafanaWorkspaceTransDetail setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

}
