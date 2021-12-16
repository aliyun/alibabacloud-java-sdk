// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCancelledErpSpiRequest extends TeaModel {
    // 采购单号
    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    // 备注，取消原因
    @NameInMap("remark")
    public String remark;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 租户ID
    @NameInMap("tenantId")
    public String tenantId;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

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

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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

    public AscpPurchasingPurchaseOrderCancelledErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

}
