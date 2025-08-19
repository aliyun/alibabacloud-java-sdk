// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetScalingConfigStatusOutput extends TeaModel {
    @NameInMap("scalingConfigStatus")
    public ScalingConfigStatus scalingConfigStatus;

    public static GetScalingConfigStatusOutput build(java.util.Map<String, ?> map) throws Exception {
        GetScalingConfigStatusOutput self = new GetScalingConfigStatusOutput();
        return TeaModel.build(map, self);
    }

    public GetScalingConfigStatusOutput setScalingConfigStatus(ScalingConfigStatus scalingConfigStatus) {
        this.scalingConfigStatus = scalingConfigStatus;
        return this;
    }
    public ScalingConfigStatus getScalingConfigStatus() {
        return this.scalingConfigStatus;
    }

}
