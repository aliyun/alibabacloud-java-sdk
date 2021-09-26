// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ActiveStatus")
    public String activeStatus;

    @NameInMap("HostGroupBizId")
    public String hostGroupBizId;

    @NameInMap("ScalingInMode")
    public String scalingInMode;

    @NameInMap("ScalingMinSize")
    public Long scalingMinSize;

    @NameInMap("ScalingMaxSize")
    public Long scalingMaxSize;

    @NameInMap("ConfigState")
    public String configState;

    public static DescribeScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupResponseBody self = new DescribeScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeScalingGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeScalingGroupResponseBody setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }
    public String getActiveStatus() {
        return this.activeStatus;
    }

    public DescribeScalingGroupResponseBody setHostGroupBizId(String hostGroupBizId) {
        this.hostGroupBizId = hostGroupBizId;
        return this;
    }
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

    public DescribeScalingGroupResponseBody setScalingInMode(String scalingInMode) {
        this.scalingInMode = scalingInMode;
        return this;
    }
    public String getScalingInMode() {
        return this.scalingInMode;
    }

    public DescribeScalingGroupResponseBody setScalingMinSize(Long scalingMinSize) {
        this.scalingMinSize = scalingMinSize;
        return this;
    }
    public Long getScalingMinSize() {
        return this.scalingMinSize;
    }

    public DescribeScalingGroupResponseBody setScalingMaxSize(Long scalingMaxSize) {
        this.scalingMaxSize = scalingMaxSize;
        return this;
    }
    public Long getScalingMaxSize() {
        return this.scalingMaxSize;
    }

    public DescribeScalingGroupResponseBody setConfigState(String configState) {
        this.configState = configState;
        return this;
    }
    public String getConfigState() {
        return this.configState;
    }

}
