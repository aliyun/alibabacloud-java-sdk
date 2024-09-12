// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Vehicle5ItemQueryRequest extends TeaModel {
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

    public static Vehicle5ItemQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        Vehicle5ItemQueryRequest self = new Vehicle5ItemQueryRequest();
        return TeaModel.build(map, self);
    }

    public Vehicle5ItemQueryRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Vehicle5ItemQueryRequest setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public Vehicle5ItemQueryRequest setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

}
