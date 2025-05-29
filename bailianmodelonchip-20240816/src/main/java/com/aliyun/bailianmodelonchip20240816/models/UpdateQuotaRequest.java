// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("durationType")
    public Integer durationType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("licenseCount")
    public Long licenseCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxQps")
    public Integer maxQps;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("packageType")
    public Integer packageType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nnjNQQv3ZjyYE7H4</p>
     */
    @NameInMap("productKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("purchaseType")
    public Integer purchaseType;

    /**
     * <strong>example:</strong>
     * <p>421</p>
     */
    @NameInMap("recordId")
    public Integer recordId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("settlementAmount")
    public Double settlementAmount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>520539530998273</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tokenNumber")
    public Long tokenNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("unitPrice")
    public Double unitPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("userId")
    public String userId;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public UpdateQuotaRequest setDurationType(Integer durationType) {
        this.durationType = durationType;
        return this;
    }
    public Integer getDurationType() {
        return this.durationType;
    }

    public UpdateQuotaRequest setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
        return this;
    }
    public Long getLicenseCount() {
        return this.licenseCount;
    }

    public UpdateQuotaRequest setMaxQps(Integer maxQps) {
        this.maxQps = maxQps;
        return this;
    }
    public Integer getMaxQps() {
        return this.maxQps;
    }

    public UpdateQuotaRequest setPackageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }
    public Integer getPackageType() {
        return this.packageType;
    }

    public UpdateQuotaRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateQuotaRequest setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    public UpdateQuotaRequest setRecordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }
    public Integer getRecordId() {
        return this.recordId;
    }

    public UpdateQuotaRequest setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
        return this;
    }
    public Double getSettlementAmount() {
        return this.settlementAmount;
    }

    public UpdateQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateQuotaRequest setTokenNumber(Long tokenNumber) {
        this.tokenNumber = tokenNumber;
        return this;
    }
    public Long getTokenNumber() {
        return this.tokenNumber;
    }

    public UpdateQuotaRequest setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public UpdateQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
