// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityResultRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: Online.</li>
     * <li><strong>hotline</strong>: Hotline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The IDs of the skill groups.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    /**
     * <p>The hit status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not hit.</li>
     * <li><strong>1</strong>: Hit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HitStatus")
    public Integer hitStatus;

    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of the quality inspection tasks.</p>
     */
    @NameInMap("ProjectIds")
    public java.util.List<Long> projectIds;

    /**
     * <p>The IDs of the quality inspection rules.</p>
     */
    @NameInMap("QualityRuleIds")
    public java.util.List<Long> qualityRuleIds;

    /**
     * <p>The end time of the session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-18 16:04:20</p>
     */
    @NameInMap("TouchEndTime")
    public String touchEndTime;

    /**
     * <p>The start time of the session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-18 16:02:20</p>
     */
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
