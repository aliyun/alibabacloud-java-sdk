// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DatasetConfig extends TeaModel {
    /**
     * <p>The content awareness configuration.</p>
     */
    @NameInMap("Insights")
    public InsightsConfig insights;

    @NameInMap("ReverseImage")
    public ReverseImageConfig reverseImage;

    /**
     * <p>The intelligent clustering configuration.</p>
     */
    @NameInMap("SmartCluster")
    public SmartClusterConfig smartCluster;

    public static DatasetConfig build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfig self = new DatasetConfig();
        return TeaModel.build(map, self);
    }

    public DatasetConfig setInsights(InsightsConfig insights) {
        this.insights = insights;
        return this;
    }
    public InsightsConfig getInsights() {
        return this.insights;
    }

    public DatasetConfig setReverseImage(ReverseImageConfig reverseImage) {
        this.reverseImage = reverseImage;
        return this;
    }
    public ReverseImageConfig getReverseImage() {
        return this.reverseImage;
    }

    public DatasetConfig setSmartCluster(SmartClusterConfig smartCluster) {
        this.smartCluster = smartCluster;
        return this;
    }
    public SmartClusterConfig getSmartCluster() {
        return this.smartCluster;
    }

}
