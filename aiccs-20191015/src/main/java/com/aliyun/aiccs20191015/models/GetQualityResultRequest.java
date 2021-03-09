// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TouchStartTime")
    public String touchStartTime;

    @NameInMap("TouchEndTime")
    public String touchEndTime;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("HitStatus")
    public Integer hitStatus;

    @NameInMap("GroupIds")
    public java.util.List<Integer> groupIds;

    @NameInMap("QualityRuleIds")
    public java.util.List<Integer> qualityRuleIds;

    @NameInMap("ProjectIds")
    public java.util.List<Integer> projectIds;

    public static GetQualityResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityResultRequest self = new GetQualityResultRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQualityResultRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetQualityResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetQualityResultRequest setTouchStartTime(String touchStartTime) {
        this.touchStartTime = touchStartTime;
        return this;
    }
    public String getTouchStartTime() {
        return this.touchStartTime;
    }

    public GetQualityResultRequest setTouchEndTime(String touchEndTime) {
        this.touchEndTime = touchEndTime;
        return this;
    }
    public String getTouchEndTime() {
        return this.touchEndTime;
    }

    public GetQualityResultRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public GetQualityResultRequest setHitStatus(Integer hitStatus) {
        this.hitStatus = hitStatus;
        return this;
    }
    public Integer getHitStatus() {
        return this.hitStatus;
    }

    public GetQualityResultRequest setGroupIds(java.util.List<Integer> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Integer> getGroupIds() {
        return this.groupIds;
    }

    public GetQualityResultRequest setQualityRuleIds(java.util.List<Integer> qualityRuleIds) {
        this.qualityRuleIds = qualityRuleIds;
        return this;
    }
    public java.util.List<Integer> getQualityRuleIds() {
        return this.qualityRuleIds;
    }

    public GetQualityResultRequest setProjectIds(java.util.List<Integer> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Integer> getProjectIds() {
        return this.projectIds;
    }

}
