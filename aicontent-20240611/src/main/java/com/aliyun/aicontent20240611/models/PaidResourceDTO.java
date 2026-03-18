// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PaidResourceDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-09-01 00:00:00</p>
     */
    @NameInMap("effectiveTime")
    public String effectiveTime;

    /**
     * <strong>example:</strong>
     * <p>2025-09-10 00:00:00</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>airec-cn-fou41hse8001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("quantity")
    public Integer quantity;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("remainQuantity")
    public Integer remainQuantity;

    /**
     * <strong>example:</strong>
     * <p>AI_ORAL</p>
     */
    @NameInMap("resourceCatalogCode")
    public String resourceCatalogCode;

    @NameInMap("resourceCatalogName")
    public String resourceCatalogName;

    /**
     * <strong>example:</strong>
     * <p>PRE_PAID_RECOURSE_PACKAGE</p>
     */
    @NameInMap("resourcePackageCode")
    public String resourcePackageCode;

    @NameInMap("resourcePackageName")
    public String resourcePackageName;

    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("resourceStatus")
    public String resourceStatus;

    public static PaidResourceDTO build(java.util.Map<String, ?> map) throws Exception {
        PaidResourceDTO self = new PaidResourceDTO();
        return TeaModel.build(map, self);
    }

    public PaidResourceDTO setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public PaidResourceDTO setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public PaidResourceDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PaidResourceDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public PaidResourceDTO setRemainQuantity(Integer remainQuantity) {
        this.remainQuantity = remainQuantity;
        return this;
    }
    public Integer getRemainQuantity() {
        return this.remainQuantity;
    }

    public PaidResourceDTO setResourceCatalogCode(String resourceCatalogCode) {
        this.resourceCatalogCode = resourceCatalogCode;
        return this;
    }
    public String getResourceCatalogCode() {
        return this.resourceCatalogCode;
    }

    public PaidResourceDTO setResourceCatalogName(String resourceCatalogName) {
        this.resourceCatalogName = resourceCatalogName;
        return this;
    }
    public String getResourceCatalogName() {
        return this.resourceCatalogName;
    }

    public PaidResourceDTO setResourcePackageCode(String resourcePackageCode) {
        this.resourcePackageCode = resourcePackageCode;
        return this;
    }
    public String getResourcePackageCode() {
        return this.resourcePackageCode;
    }

    public PaidResourceDTO setResourcePackageName(String resourcePackageName) {
        this.resourcePackageName = resourcePackageName;
        return this;
    }
    public String getResourcePackageName() {
        return this.resourcePackageName;
    }

    public PaidResourceDTO setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public String getResourceStatus() {
        return this.resourceStatus;
    }

}
