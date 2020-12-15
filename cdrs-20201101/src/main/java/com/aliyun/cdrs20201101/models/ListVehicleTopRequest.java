// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleTopRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("PlateId")
    @Validation(required = true)
    public String plateId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static ListVehicleTopRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleTopRequest self = new ListVehicleTopRequest();
        return TeaModel.build(map, self);
    }

    public ListVehicleTopRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListVehicleTopRequest setPlateId(String plateId) {
        this.plateId = plateId;
        return this;
    }
    public String getPlateId() {
        return this.plateId;
    }

    public ListVehicleTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListVehicleTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
