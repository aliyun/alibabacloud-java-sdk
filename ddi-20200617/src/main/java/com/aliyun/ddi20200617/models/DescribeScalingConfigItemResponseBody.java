// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigItemResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("ConfigItemType")
    public String configItemType;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ScalingConfigItemBizId")
    public String scalingConfigItemBizId;

    @NameInMap("ConfigItemInformation")
    public String configItemInformation;

    public static DescribeScalingConfigItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigItemResponseBody self = new DescribeScalingConfigItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigItemResponseBody setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

    public DescribeScalingConfigItemResponseBody setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public DescribeScalingConfigItemResponseBody setScalingConfigItemBizId(String scalingConfigItemBizId) {
        this.scalingConfigItemBizId = scalingConfigItemBizId;
        return this;
    }
    public String getScalingConfigItemBizId() {
        return this.scalingConfigItemBizId;
    }

    public DescribeScalingConfigItemResponseBody setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

}
