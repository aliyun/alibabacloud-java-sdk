// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter applies only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The billing method of the cloud drive.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("CdsChargeType")
    public String cdsChargeType;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance. This parameter is required when <code>OfficeSiteType</code> is set to <code>AD_CONNECTOR</code> and you do not specify <code>OfficeSiteId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-g4ba1mkji8nj6****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The name of the domain controller. This parameter is required when <code>OfficeSiteType</code> is set to <code>AD_CONNECTOR</code> and you do not specify <code>OfficeSiteId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test.local</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>A list of user IDs.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The total capacity of the cloud drive.</p>
     * <ul>
     * <li><p>For pay-as-you-go cloud drives, the unit is bytes.</p>
     * </li>
     * <li><p>For subscription cloud drives, the unit is GiB. For example, set the value to 500 for 500 GiB, or to 2048 for 2 TiB.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>536870912000</p>
     */
    @NameInMap("MaxSize")
    public Long maxSize;

    /**
     * <p>The name of the cloud drive.</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-cds</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the office site. This parameter applies only when <code>OfficeSiteType</code> is set to <code>AD_CONNECTOR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the office site.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. This parameter is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration. This parameter is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    /**
     * <p>The maximum number of users for a subscription cloud drive. This parameter is required only when <code>CdsChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserCount")
    public Long userCount;

    /**
     * <p>The maximum size of the personal disk for each user, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>104857600</p>
     */
    @NameInMap("UserMaxSize")
    public Long userMaxSize;

    public static CreateCloudDriveServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceRequest self = new CreateCloudDriveServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCloudDriveServiceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateCloudDriveServiceRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateCloudDriveServiceRequest setCdsChargeType(String cdsChargeType) {
        this.cdsChargeType = cdsChargeType;
        return this;
    }
    public String getCdsChargeType() {
        return this.cdsChargeType;
    }

    public CreateCloudDriveServiceRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCloudDriveServiceRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCloudDriveServiceRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public CreateCloudDriveServiceRequest setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public CreateCloudDriveServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudDriveServiceRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateCloudDriveServiceRequest setOfficeSiteType(String officeSiteType) {
        this.officeSiteType = officeSiteType;
        return this;
    }
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    public CreateCloudDriveServiceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateCloudDriveServiceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCloudDriveServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudDriveServiceRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public CreateCloudDriveServiceRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public CreateCloudDriveServiceRequest setUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }
    public Long getUserCount() {
        return this.userCount;
    }

    public CreateCloudDriveServiceRequest setUserMaxSize(Long userMaxSize) {
        this.userMaxSize = userMaxSize;
        return this;
    }
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

}
