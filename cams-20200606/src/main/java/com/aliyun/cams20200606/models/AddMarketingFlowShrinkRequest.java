// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddMarketingFlowShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ActivityDesc")
    public String activityDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ActivityName")
    public String activityName;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("ExecutionType")
    public String executionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("ParamFlag")
    public String paramFlag;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RelatedFlowCode")
    public String relatedFlowCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RelatedFlowName")
    public String relatedFlowName;

    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("RelatedGroupId")
    public Long relatedGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static AddMarketingFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMarketingFlowShrinkRequest self = new AddMarketingFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddMarketingFlowShrinkRequest setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
        return this;
    }
    public String getActivityDesc() {
        return this.activityDesc;
    }

    public AddMarketingFlowShrinkRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public AddMarketingFlowShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public AddMarketingFlowShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public AddMarketingFlowShrinkRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public AddMarketingFlowShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public AddMarketingFlowShrinkRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public AddMarketingFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMarketingFlowShrinkRequest setParamFlag(String paramFlag) {
        this.paramFlag = paramFlag;
        return this;
    }
    public String getParamFlag() {
        return this.paramFlag;
    }

    public AddMarketingFlowShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public AddMarketingFlowShrinkRequest setRelatedFlowCode(String relatedFlowCode) {
        this.relatedFlowCode = relatedFlowCode;
        return this;
    }
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    public AddMarketingFlowShrinkRequest setRelatedFlowName(String relatedFlowName) {
        this.relatedFlowName = relatedFlowName;
        return this;
    }
    public String getRelatedFlowName() {
        return this.relatedFlowName;
    }

    public AddMarketingFlowShrinkRequest setRelatedGroupId(Long relatedGroupId) {
        this.relatedGroupId = relatedGroupId;
        return this;
    }
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
    }

    public AddMarketingFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMarketingFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMarketingFlowShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
