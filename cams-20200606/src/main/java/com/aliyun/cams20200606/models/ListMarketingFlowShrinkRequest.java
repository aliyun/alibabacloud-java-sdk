// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMarketingFlowShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rewrwerw</p>
     */
    @NameInMap("ActivityCode")
    public String activityCode;

    /**
     * <strong>example:</strong>
     * <p>werewew</p>
     */
    @NameInMap("ActivityName")
    public String activityName;

    /**
     * <strong>example:</strong>
     * <p>sucess</p>
     */
    @NameInMap("ActivityStatus")
    public String activityStatus;

    /**
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public String pageIndex;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>asdfsdfdsfs</p>
     */
    @NameInMap("RelatedFlowCode")
    public String relatedFlowCode;

    /**
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("RelatedGroupId")
    public Long relatedGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListMarketingFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMarketingFlowShrinkRequest self = new ListMarketingFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMarketingFlowShrinkRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public ListMarketingFlowShrinkRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public ListMarketingFlowShrinkRequest setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
    public String getActivityStatus() {
        return this.activityStatus;
    }

    public ListMarketingFlowShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ListMarketingFlowShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public ListMarketingFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListMarketingFlowShrinkRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public ListMarketingFlowShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListMarketingFlowShrinkRequest setRelatedFlowCode(String relatedFlowCode) {
        this.relatedFlowCode = relatedFlowCode;
        return this;
    }
    public String getRelatedFlowCode() {
        return this.relatedFlowCode;
    }

    public ListMarketingFlowShrinkRequest setRelatedGroupId(Long relatedGroupId) {
        this.relatedGroupId = relatedGroupId;
        return this;
    }
    public Long getRelatedGroupId() {
        return this.relatedGroupId;
    }

    public ListMarketingFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListMarketingFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
