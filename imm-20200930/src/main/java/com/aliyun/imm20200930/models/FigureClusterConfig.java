// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureClusterConfig extends TeaModel {
    @NameInMap("AutoClustering")
    public Boolean autoClustering;

    @NameInMap("AutoGenerate")
    public Boolean autoGenerate;

    @NameInMap("EnabledFeatures")
    public java.util.List<String> enabledFeatures;

    @NameInMap("MinEntityCount")
    public Long minEntityCount;

    public static FigureClusterConfig build(java.util.Map<String, ?> map) throws Exception {
        FigureClusterConfig self = new FigureClusterConfig();
        return TeaModel.build(map, self);
    }

    public FigureClusterConfig setAutoClustering(Boolean autoClustering) {
        this.autoClustering = autoClustering;
        return this;
    }
    public Boolean getAutoClustering() {
        return this.autoClustering;
    }

    public FigureClusterConfig setAutoGenerate(Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
        return this;
    }
    public Boolean getAutoGenerate() {
        return this.autoGenerate;
    }

    public FigureClusterConfig setEnabledFeatures(java.util.List<String> enabledFeatures) {
        this.enabledFeatures = enabledFeatures;
        return this;
    }
    public java.util.List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }

    public FigureClusterConfig setMinEntityCount(Long minEntityCount) {
        this.minEntityCount = minEntityCount;
        return this;
    }
    public Long getMinEntityCount() {
        return this.minEntityCount;
    }

}
