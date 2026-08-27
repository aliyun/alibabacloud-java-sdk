// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddMarketingFlowRequest extends TeaModel {
    /**
     * <p>The description of the campaign.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value example value.</p>
     */
    @NameInMap("ActivityDesc")
    public String activityDesc;

    /**
     * <p>The name of the node instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value example value.</p>
     */
    @NameInMap("ActivityName")
    public String activityName;

    /**
     * <p>The business code.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public java.util.Map<String, ?> bizExtend;

    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value example value example value.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value example value example value.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The trigger method of the baseline scan. Valid values:</p>
     * <ul>
     * <li><strong>Schedule</strong>: Triggered by a periodic configuration task.</li>
     * <li><strong>Manual</strong>: Manually triggered.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("ExecutionType")
    public String executionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The parameter flag.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("ParamFlag")
    public String paramFlag;

    /**
     * <p>The API parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public java.util.Map<String, ?> params;

    /**
     * <p>The code of the associated flow.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("RelatedFlowCode")
    public String relatedFlowCode;

    /**
     * <p>The name of the associated flow.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("RelatedFlowName")
    public String relatedFlowName;

    /**
     * <p>The ID of the related group.</p>
     * 
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
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static AddMarketingFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMarketingFlowRequest self = new AddMarketingFlowRequest();
        return TeaModel.build(map, self);
    }

    public AddMarketingFlowRequest setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
        return this;
    }
    public String getActivityDesc() {
        return this.activityDesc;
    }

    public AddMarketingFlowRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public AddMarketingFlowRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public AddMarketingFlowRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public AddMarketingFlowRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public AddMarketingFlowRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public AddMarketingFlowRequest setExecutionType(String executionType) {
        this.executionType = executionType;
        return this;
    }
    public String getExecutionType() {
        return this.executionType;
    }

    public AddMarketingFlowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMarketingFlowRequest setParamFlag(String paramFlag) {
        this.paramFlag = paramFlag;
        return this;
    }
    public String getParamFlag() {
        return this.paramFlag;
    }

    public AddMarketingFlowRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public AddMarketingFlowRequest setRelatedFlowCode(String relatedFlowCode) {
        this.relatedFlowCode = relatedFlowCode;
        return this;
    }
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    public AddMarketingFlowRequest setRelatedFlowName(String relatedFlowName) {
        this.relatedFlowName = relatedFlowName;
        return this;
    }
    public String getRelatedFlowName() {
        return this.relatedFlowName;
    }

    public AddMarketingFlowRequest setRelatedGroupId(Long relatedGroupId) {
        this.relatedGroupId = relatedGroupId;
        return this;
    }
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
    }

    public AddMarketingFlowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddMarketingFlowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddMarketingFlowRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
