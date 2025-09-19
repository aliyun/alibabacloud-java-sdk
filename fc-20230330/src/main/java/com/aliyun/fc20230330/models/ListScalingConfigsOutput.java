// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListScalingConfigsOutput extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("scalingConfigs")
    public java.util.List<ScalingConfigStatus> scalingConfigs;

    public static ListScalingConfigsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigsOutput self = new ListScalingConfigsOutput();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingConfigsOutput setScalingConfigs(java.util.List<ScalingConfigStatus> scalingConfigs) {
        this.scalingConfigs = scalingConfigs;
        return this;
    }
    public java.util.List<ScalingConfigStatus> getScalingConfigs() {
        return this.scalingConfigs;
    }

}
