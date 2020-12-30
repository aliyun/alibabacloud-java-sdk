// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigItemV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingConfigItemBizId")
    public String scalingConfigItemBizId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ConfigItemInformation")
    public String configItemInformation;

    @NameInMap("ConfigItemType")
    public String configItemType;

    public static DescribeScalingConfigItemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigItemV2ResponseBody self = new DescribeScalingConfigItemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigItemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigItemV2ResponseBody setScalingConfigItemBizId(String scalingConfigItemBizId) {
        this.scalingConfigItemBizId = scalingConfigItemBizId;
        return this;
    }
    public String getScalingConfigItemBizId() {
        return this.scalingConfigItemBizId;
    }

    public DescribeScalingConfigItemV2ResponseBody setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public DescribeScalingConfigItemV2ResponseBody setConfigItemInformation(String configItemInformation) {
        this.configItemInformation = configItemInformation;
        return this;
    }
    public String getConfigItemInformation() {
        return this.configItemInformation;
    }

    public DescribeScalingConfigItemV2ResponseBody setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

}
