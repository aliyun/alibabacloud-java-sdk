// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    @NameInMap("HitStatus")
    public Integer hitStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectIds")
    public java.util.List<Long> projectIds;

    @NameInMap("QualityRuleIds")
    public java.util.List<Long> qualityRuleIds;

    @NameInMap("TouchEndTime")
    public String touchEndTime;

    @NameInMap("TouchStartTime")
    public String touchStartTime;

    public static GetQualityResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityResultRequest self = new GetQualityResultRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityResultRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public GetQualityResultRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public GetQualityResultRequest setHitStatus(Integer hitStatus) {
        this.hitStatus = hitStatus;
        return this;
    }
    public Integer getHitStatus() {
        return this.hitStatus;
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

    public GetQualityResultRequest setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    public GetQualityResultRequest setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
        this.qualityRuleIds = qualityRuleIds;
        return this;
    }
    public java.util.List<Long> getQualityRuleIds() {
        return this.qualityRuleIds;
    }

    public GetQualityResultRequest setTouchEndTime(String touchEndTime) {
        this.touchEndTime = touchEndTime;
        return this;
    }
    public String getTouchEndTime() {
        return this.touchEndTime;
    }

    public GetQualityResultRequest setTouchStartTime(String touchStartTime) {
        this.touchStartTime = touchStartTime;
        return this;
    }
    public String getTouchStartTime() {
        return this.touchStartTime;
    }

}
