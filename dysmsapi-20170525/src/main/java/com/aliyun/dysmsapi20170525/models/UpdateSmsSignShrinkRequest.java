// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsSignShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2004393xxxx</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignSource")
    public Integer signSource;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignType")
    public Integer signType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    public static UpdateSmsSignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignShrinkRequest self = new UpdateSmsSignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignShrinkRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public UpdateSmsSignShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public UpdateSmsSignShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsSignShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public UpdateSmsSignShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsSignShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsSignShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmsSignShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public UpdateSmsSignShrinkRequest setSignSource(Integer signSource) {
        this.signSource = signSource;
        return this;
    }
    public Integer getSignSource() {
        return this.signSource;
    }

    public UpdateSmsSignShrinkRequest setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public UpdateSmsSignShrinkRequest setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

}
