// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("CdsChargeType")
    public String cdsChargeType;

    /**
     * <strong>example:</strong>
     * <p>cen-g4ba1mkji8nj6****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <strong>example:</strong>
     * <p>test.local</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>536870912000</p>
     */
    @NameInMap("MaxSize")
    public Long maxSize;

    /**
     * <p>The name of the cloud disk that you want to create in Cloud Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-pds</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    @NameInMap("Period")
    public Long period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The solution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>co-0esnf8kb8zpfbqmvt</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    @NameInMap("UserCount")
    public Long userCount;

    /**
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
