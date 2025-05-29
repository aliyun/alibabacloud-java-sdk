// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateImageQuotaRequest extends TeaModel {
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
     * <p>100</p>
     */
    @NameInMap("imageCount")
    public Integer imageCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("licenseCount")
    public Long licenseCount;

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
     * <p>2oImhCz4f8XCviiM</p>
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
     * <p>355</p>
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

    public static UpdateImageQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageQuotaRequest self = new UpdateImageQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageQuotaRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public UpdateImageQuotaRequest setDurationType(Integer durationType) {
        this.durationType = durationType;
        return this;
    }
    public Integer getDurationType() {
        return this.durationType;
    }

    public UpdateImageQuotaRequest setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public UpdateImageQuotaRequest setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
        return this;
    }
    public Long getLicenseCount() {
        return this.licenseCount;
    }

    public UpdateImageQuotaRequest setPackageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }
    public Integer getPackageType() {
        return this.packageType;
    }

    public UpdateImageQuotaRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateImageQuotaRequest setPurchaseType(Integer purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    public UpdateImageQuotaRequest setRecordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }
    public Integer getRecordId() {
        return this.recordId;
    }

    public UpdateImageQuotaRequest setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
        return this;
    }
    public Double getSettlementAmount() {
        return this.settlementAmount;
    }

    public UpdateImageQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateImageQuotaRequest setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public UpdateImageQuotaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
