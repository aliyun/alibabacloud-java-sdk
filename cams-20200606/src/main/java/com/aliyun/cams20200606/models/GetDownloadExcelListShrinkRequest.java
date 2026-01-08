// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetDownloadExcelListShrinkRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("Condition")
    public String condition;

    @NameInMap("CountryNames")
    public String countryNamesShrink;

    /**
     * <strong>example:</strong>
     * <p>2025-12-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupIds")
    public String groupIdsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>2025-11-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static GetDownloadExcelListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadExcelListShrinkRequest self = new GetDownloadExcelListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadExcelListShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GetDownloadExcelListShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public GetDownloadExcelListShrinkRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GetDownloadExcelListShrinkRequest setCountryNamesShrink(String countryNamesShrink) {
        this.countryNamesShrink = countryNamesShrink;
        return this;
    }
    public String getCountryNamesShrink() {
        return this.countryNamesShrink;
    }

    public GetDownloadExcelListShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetDownloadExcelListShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetDownloadExcelListShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetDownloadExcelListShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDownloadExcelListShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetDownloadExcelListShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetDownloadExcelListShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
