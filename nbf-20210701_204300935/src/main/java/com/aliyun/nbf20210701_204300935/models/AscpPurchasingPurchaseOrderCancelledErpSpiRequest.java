// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCancelledErpSpiRequest extends TeaModel {
    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 备注，取消原因
    @NameInMap("remark")
    public String remark;

    public static AscpPurchasingPurchaseOrderCancelledErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCancelledErpSpiRequest self = new AscpPurchasingPurchaseOrderCancelledErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
