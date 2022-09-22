// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class FeedbackDiagnoseRequest extends TeaModel {
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    @NameInMap("Mark")
    public String mark;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Star")
    public Integer star;

    public static FeedbackDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackDiagnoseRequest self = new FeedbackDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackDiagnoseRequest setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public FeedbackDiagnoseRequest setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public FeedbackDiagnoseRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public FeedbackDiagnoseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FeedbackDiagnoseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public FeedbackDiagnoseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FeedbackDiagnoseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FeedbackDiagnoseRequest setStar(Integer star) {
        this.star = star;
        return this;
    }
    public Integer getStar() {
        return this.star;
    }

}
