// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleResultsRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("VehicleColor")
    public String vehicleColor;

    @NameInMap("VehicleClass")
    public String vehicleClass;

    @NameInMap("VehicleApplication")
    public String vehicleApplication;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    public static ListVehicleResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleResultsRequest self = new ListVehicleResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListVehicleResultsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListVehicleResultsRequest setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
        return this;
    }
    public String getVehicleColor() {
        return this.vehicleColor;
    }

    public ListVehicleResultsRequest setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
        return this;
    }
    public String getVehicleClass() {
        return this.vehicleClass;
    }

    public ListVehicleResultsRequest setVehicleApplication(String vehicleApplication) {
        this.vehicleApplication = vehicleApplication;
        return this;
    }
    public String getVehicleApplication() {
        return this.vehicleApplication;
    }

    public ListVehicleResultsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListVehicleResultsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListVehicleResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVehicleResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
