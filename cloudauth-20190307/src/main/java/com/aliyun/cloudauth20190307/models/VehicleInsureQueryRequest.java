// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleInsureQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    /**
     * <strong>example:</strong>
     * <p>LB**************</p>
     */
    @NameInMap("Vin")
    public String vin;

    public static VehicleInsureQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        VehicleInsureQueryRequest self = new VehicleInsureQueryRequest();
        return TeaModel.build(map, self);
    }

    public VehicleInsureQueryRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public VehicleInsureQueryRequest setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleInsureQueryRequest setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleInsureQueryRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

}
