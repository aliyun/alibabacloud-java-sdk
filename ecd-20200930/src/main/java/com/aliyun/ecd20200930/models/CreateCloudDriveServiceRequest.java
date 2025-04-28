// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables the auto-payment feature. Ensure your Alibaba Cloud account has sufficient balance. Insufficient balance may result in abnormal orders.</li>
     * <li>false (default): disables the auto-payment feature. The order is generated, but payment must be made manually. You can log on to the Alibaba Cloud Management Console and complete the payment based on the order ID on the Orders page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Optional. Specifies whether to enable the auto-renewal feature. This parameter takes effect only if you set CdsChargeType to <code>Prepaid</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The billing method of the enterprise drive.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("CdsChargeType")
    public String cdsChargeType;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance. This parameter takes effect only if you set <code>OfficeSiteType</code> to <code>AD_CONNECTOR</code>. If you have configured <code>OfficeSiteId</code>, you can leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-g4ba1mkji8nj6****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The domain name of the enterprise AD office network. This parameter takes effect only if you set <code>OfficeSiteType</code> to <code>AD_CONNECTOR</code>. If you have configured <code>OfficeSiteId</code>, you can leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test.local</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The user IDs.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The maximum storage capacity of the enterprise drive.</p>
     * <ul>
     * <li>For a pay-as-you-go enterprise drive, the unit is bytes.</li>
     * <li>For a subscription enterprise drive, the unit is GiB. For example, to create a 500 GiB subscription drive, set the value to 500 GiB. To create a 2 TiB subscription drive, set the value to 2048 GiB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>536870912000</p>
     */
    @NameInMap("MaxSize")
    public Long maxSize;

    /**
     * <p>The name of the enterprise drive</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-pds</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the office network. This parameter takes effect only if you set OfficeSiteType to <code>AD_CONNECTOR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the office network.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SIMPLE: convenience office network.</li>
     * <li>AD_CONNECTOR: enterprise Active Directory (AD) office network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect only if you set <code>CdsChargeType</code> to <code>PrePaid</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>Required. The unit of the subscription duration. This parameter takes effect only if you set <code>CdsChargeType</code> to <code>PrePaid</code>.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Enterprise Drive Service is available.</p>
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
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>co-0esnf8kb8zpfbqmvt</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    /**
     * <p>Required. The maximum number of users allowed on the enterprise drive. This parameter takes effect only if you set <code>CdsChargeType</code> to <code>PrePaid</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>5 when the value of MaxSize is 500 GiB.</li>
     * <li>20 when the value of MaxSize is 2048 GiB.</li>
     * <li>50 when the value of MaxSize is 5120 GiB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserCount")
    public Long userCount;

    /**
     * <p>The maximum storage capacity of the user\&quot;s personal disk when allocated. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
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
