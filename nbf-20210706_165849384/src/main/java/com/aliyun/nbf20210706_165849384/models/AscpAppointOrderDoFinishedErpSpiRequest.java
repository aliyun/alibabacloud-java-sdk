// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderDoFinishedErpSpiRequest extends TeaModel {
    // 改约原因
    @NameInMap("reason")
    public String reason;

    // 预约波次
    @NameInMap("appointWave")
    public Integer appointWave;

    // 预约类型
    @NameInMap("appointType")
    public String appointType;

    // 履行单号
    @NameInMap("fulfilmentOrderCode")
    public String fulfilmentOrderCode;

    // 待预约单据编号
    @NameInMap("outOrderCode")
    public String outOrderCode;

    // 预约日期
    @NameInMap("appointDate")
    public String appointDate;

    // 预约单号
    @NameInMap("appointOrderCode")
    public String appointOrderCode;

    // 关联业务单号
    @NameInMap("outBusinessOrderCode")
    public String outBusinessOrderCode;

    public static AscpAppointOrderDoFinishedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderDoFinishedErpSpiRequest self = new AscpAppointOrderDoFinishedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderDoFinishedErpSpiRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
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

}
