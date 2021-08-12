// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderDoFinishedErpSpiRequest extends TeaModel {
    // 预约波次（新）
    @NameInMap("appointWave")
    public Integer appointWave;

    // 预约类型
    @NameInMap("appointType")
    public String appointType;

    // 库位地址
    @NameInMap("warehouseAddress")
    public String warehouseAddress;

    // 改约原因
    @NameInMap("reason")
    public String reason;

    // 预约波次(旧)
    @NameInMap("originalAppointWave")
    public Integer originalAppointWave;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 履行单号
    @NameInMap("fulfilmentOrderCode")
    public String fulfilmentOrderCode;

    // 待预约单据编号
    @NameInMap("outOrderCode")
    public String outOrderCode;

    // 库位类型
    @NameInMap("warehouseType")
    public String warehouseType;

    // 预约日期(旧)
    @NameInMap("originalAppointDate")
    public String originalAppointDate;

    // 预约日期（新）
    @NameInMap("appointDate")
    public String appointDate;

    // 预约单号
    @NameInMap("appointOrderCode")
    public String appointOrderCode;

    // 关联业务单号
    @NameInMap("outBusinessOrderCode")
    public String outBusinessOrderCode;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static AscpAppointOrderDoFinishedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderDoFinishedErpSpiRequest self = new AscpAppointOrderDoFinishedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setAppointWave(Integer appointWave) {
        this.appointWave = appointWave;
        return this;
    }
    public Integer getAppointWave() {
        return this.appointWave;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setAppointType(String appointType) {
        this.appointType = appointType;
        return this;
    }
    public String getAppointType() {
        return this.appointType;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
        return this;
    }
    public String getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setOriginalAppointWave(Integer originalAppointWave) {
        this.originalAppointWave = originalAppointWave;
        return this;
    }
    public Integer getOriginalAppointWave() {
        return this.originalAppointWave;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setFulfilmentOrderCode(String fulfilmentOrderCode) {
        this.fulfilmentOrderCode = fulfilmentOrderCode;
        return this;
    }
    public String getFulfilmentOrderCode() {
        return this.fulfilmentOrderCode;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setOutOrderCode(String outOrderCode) {
        this.outOrderCode = outOrderCode;
        return this;
    }
    public String getOutOrderCode() {
        return this.outOrderCode;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
        return this;
    }
    public String getWarehouseType() {
        return this.warehouseType;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setOriginalAppointDate(String originalAppointDate) {
        this.originalAppointDate = originalAppointDate;
        return this;
    }
    public String getOriginalAppointDate() {
        return this.originalAppointDate;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setAppointDate(String appointDate) {
        this.appointDate = appointDate;
        return this;
    }
    public String getAppointDate() {
        return this.appointDate;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setAppointOrderCode(String appointOrderCode) {
        this.appointOrderCode = appointOrderCode;
        return this;
    }
    public String getAppointOrderCode() {
        return this.appointOrderCode;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setOutBusinessOrderCode(String outBusinessOrderCode) {
        this.outBusinessOrderCode = outBusinessOrderCode;
        return this;
    }
    public String getOutBusinessOrderCode() {
        return this.outBusinessOrderCode;
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

}
