// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureClusterConfig extends TeaModel {
    /**
     * <p>Specifies whether to allow IMM to perform classification tasks on files in the dataset. Default value: False.</p>
     */
    @NameInMap("AutoClustering")
    public Boolean autoClustering;

    /**
     * <p>Indicates whether IMM is allowed to perform automatic creation of new groups. Default value: False.</p>
     */
    @NameInMap("AutoGenerate")
    public Boolean autoGenerate;

    /**
     * <p>The features supported by figure clustering.</p>
     */
    @NameInMap("EnabledFeatures")
    public java.util.List<String> enabledFeatures;

    /**
     * <p>The minimum threshold for the number of entities when automatic generation of new groups is allowed. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
