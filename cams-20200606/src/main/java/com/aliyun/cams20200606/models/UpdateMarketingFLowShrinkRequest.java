// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateMarketingFLowShrinkRequest extends TeaModel {
    /**
     * <p>The code of the campaign to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>115311507XXXX49888</p>
     */
    @NameInMap("ActivityCode")
    public String activityCode;

    /**
     * <p>The description of the campaign.</p>
     * 
     * <strong>example:</strong>
     * <p>Campaign description</p>
     */
    @NameInMap("ActivityDesc")
    public String activityDesc;

    /**
     * <p>The ID of the campaign to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>674574575658675XX</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <p>The name of the campaign.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ActivityName")
    public String activityName;

    /**
     * <p>The cron expression for periodic scheduling.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The end time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-26 09:59:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The execution method. Set this parameter to 1 (cron).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecutionType")
    public String executionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to pass custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>Y: Pass custom parameters. N: Do not pass parameters</p>
     */
    @NameInMap("ParamFlag")
    public String paramFlag;

    /**
     * <p>The custom parameters to pass.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;testEmail&quot;:&quot;wy****<a href="mailto:999@alibaba-inc.com">999@alibaba-inc.com</a>&quot;}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    /**
     * <p>The code of the associated flow.</p>
     * 
     * <strong>example:</strong>
     * <p>cf-kr3k31**mfeir8w</p>
     */
    @NameInMap("RelatedFlowCode")
    public String relatedFlowCode;

    /**
     * <p>The name of the associated flow.</p>
     * 
     * <strong>example:</strong>
     * <p>testflow</p>
     */
    @NameInMap("RelatedFlowName")
    public String relatedFlowName;

    /**
     * <p>The ID of the associated group.</p>
     * 
     * <strong>example:</strong>
     * <p>114345654645XX</p>
     */
    @NameInMap("RelatedGroupId")
    public Long relatedGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-25 09:59:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static UpdateMarketingFLowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMarketingFLowShrinkRequest self = new UpdateMarketingFLowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMarketingFLowShrinkRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public UpdateMarketingFLowShrinkRequest setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
        return this;
    }
    public String getActivityDesc() {
        return this.activityDesc;
    }

    public UpdateMarketingFLowShrinkRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public UpdateMarketingFLowShrinkRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public UpdateMarketingFLowShrinkRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public UpdateMarketingFLowShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateMarketingFLowShrinkRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public UpdateMarketingFLowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMarketingFLowShrinkRequest setParamFlag(String paramFlag) {
        this.paramFlag = paramFlag;
        return this;
    }
    public String getParamFlag() {
        return this.paramFlag;
    }

    public UpdateMarketingFLowShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public UpdateMarketingFLowShrinkRequest setRelatedFlowCode(String relatedFlowCode) {
        this.relatedFlowCode = relatedFlowCode;
        return this;
    }
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    public UpdateMarketingFLowShrinkRequest setRelatedFlowName(String relatedFlowName) {
        this.relatedFlowName = relatedFlowName;
        return this;
    }
    public String getRelatedFlowName() {
        return this.relatedFlowName;
    }

    public UpdateMarketingFLowShrinkRequest setRelatedGroupId(Long relatedGroupId) {
        this.relatedGroupId = relatedGroupId;
        return this;
    }
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
    }

    public UpdateMarketingFLowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMarketingFLowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMarketingFLowShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
