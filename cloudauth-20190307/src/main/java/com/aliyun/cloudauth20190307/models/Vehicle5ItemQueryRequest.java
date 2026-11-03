// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Vehicle5ItemQueryRequest extends TeaModel {
    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: no encryption</li>
     * <li><strong>md5</strong>: MD5 encryption</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The license plate number.</p>
     * <ul>
     * <li>When paramType is set to normal, enter the plaintext.</li>
     * <li>When paramType is set to md5, enter the plaintext of the license plate number excluding the last two characters, followed by the 32-bit lowercase MD5 hash of the last two characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>陕A9****</p>
     */
    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <p>The vehicle type. Valid values:</p>
     * <ul>
     * <li>02: regular small passenger vehicle</li>
     * <li>52: new energy small passenger vehicle</li>
     * </ul>
     * 
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
