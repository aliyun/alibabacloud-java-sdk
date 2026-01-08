// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetDownloadExcelListRequest extends TeaModel {
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
    public java.util.Map<String, ?> bizExtend;

    /**
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("Condition")
    public String condition;

    @NameInMap("CountryNames")
    public java.util.List<String> countryNames;

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
    public java.util.List<String> groupIds;

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

    public static GetDownloadExcelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadExcelListRequest self = new GetDownloadExcelListRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadExcelListRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GetDownloadExcelListRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public GetDownloadExcelListRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GetDownloadExcelListRequest setCountryNames(java.util.List<String> countryNames) {
        this.countryNames = countryNames;
        return this;
    }
    public java.util.List<String> getCountryNames() {
        return this.countryNames;
    }

    public GetDownloadExcelListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetDownloadExcelListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetDownloadExcelListRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public GetDownloadExcelListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDownloadExcelListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetDownloadExcelListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetDownloadExcelListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
