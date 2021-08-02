// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderCancelledErpSpiRequest extends TeaModel {
    // 取消原因
    @NameInMap("reason")
    public String reason;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 履行单号
    @NameInMap("fulfilmentOrderCode")
    public String fulfilmentOrderCode;

    // 待预约单据编号
    @NameInMap("outOrderCode")
    public String outOrderCode;

    // 预约单号
    @NameInMap("appointOrderCode")
    public String appointOrderCode;

    // 关联业务单号
    @NameInMap("outBusinessOrderCode")
    public String outBusinessOrderCode;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static AscpAppointOrderCancelledErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderCancelledErpSpiRequest self = new AscpAppointOrderCancelledErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderCancelledErpSpiRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AscpAppointOrderCancelledErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpAppointOrderCancelledErpSpiRequest setFulfilmentOrderCode(String fulfilmentOrderCode) {
        this.fulfilmentOrderCode = fulfilmentOrderCode;
        return this;
    }
    public String getFulfilmentOrderCode() {
        return this.fulfilmentOrderCode;
    }

    public AscpAppointOrderCancelledErpSpiRequest setOutOrderCode(String outOrderCode) {
        this.outOrderCode = outOrderCode;
        return this;
    }
    public String getOutOrderCode() {
        return this.outOrderCode;
    }

    public AscpAppointOrderCancelledErpSpiRequest setAppointOrderCode(String appointOrderCode) {
        this.appointOrderCode = appointOrderCode;
        return this;
    }
    public String getAppointOrderCode() {
        return this.appointOrderCode;
    }

    public AscpAppointOrderCancelledErpSpiRequest setOutBusinessOrderCode(String outBusinessOrderCode) {
        this.outBusinessOrderCode = outBusinessOrderCode;
        return this;
    }
    public String getOutBusinessOrderCode() {
        return this.outBusinessOrderCode;
    }

    public AscpAppointOrderCancelledErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

}
