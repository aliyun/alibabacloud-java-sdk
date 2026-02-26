// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DatasetConfig extends TeaModel {
    @NameInMap("Insights")
    public InsightsConfig insights;

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

}
