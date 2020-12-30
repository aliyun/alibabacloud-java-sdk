// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupV2ResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("HostGroupBizId")
    public String hostGroupBizId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigState")
    public String configState;

    @NameInMap("ScalingInMode")
    public String scalingInMode;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingMaxSize")
    public Integer scalingMaxSize;

    @NameInMap("ScalingMinSize")
    public Integer scalingMinSize;

    @NameInMap("Name")
    public String name;

    @NameInMap("ActiveStatus")
    public String activeStatus;

    public static DescribeScalingGroupV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupV2ResponseBody self = new DescribeScalingGroupV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupV2ResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeScalingGroupV2ResponseBody setHostGroupBizId(String hostGroupBizId) {
        this.hostGroupBizId = hostGroupBizId;
        return this;
    }
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

    public DescribeScalingGroupV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupV2ResponseBody setConfigState(String configState) {
        this.configState = configState;
        return this;
    }
    public String getConfigState() {
        return this.configState;
    }

    public DescribeScalingGroupV2ResponseBody setScalingInMode(String scalingInMode) {
        this.scalingInMode = scalingInMode;
        return this;
    }
    public String getScalingInMode() {
        return this.scalingInMode;
    }

    public DescribeScalingGroupV2ResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingGroupV2ResponseBody setScalingMaxSize(Integer scalingMaxSize) {
        this.scalingMaxSize = scalingMaxSize;
        return this;
    }
    public Integer getScalingMaxSize() {
        return this.scalingMaxSize;
    }

    public DescribeScalingGroupV2ResponseBody setScalingMinSize(Integer scalingMinSize) {
        this.scalingMinSize = scalingMinSize;
        return this;
    }
    public Integer getScalingMinSize() {
        return this.scalingMinSize;
    }

    public DescribeScalingGroupV2ResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeScalingGroupV2ResponseBody setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }
    public String getActiveStatus() {
        return this.activeStatus;
    }

}
