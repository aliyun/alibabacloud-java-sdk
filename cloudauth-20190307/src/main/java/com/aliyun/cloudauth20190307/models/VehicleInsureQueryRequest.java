// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleInsureQueryRequest extends TeaModel {
    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: not encrypted.</li>
     * <li><strong>md5</strong>: MD5-encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The license plate number.</p>
     * <blockquote>
     * <ul>
     * <li>If ParamType is set to normal, enter the plaintext value.</li>
     * <li>If ParamType is set to md5, enter the plaintext of the license plate number excluding the last two characters, concatenated with the MD5-encrypted value of the last two characters (32-bit lowercase MD5).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>陕A9****</p>
     */
    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <p>The vehicle type on the driving license.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    /**
     * <p>The vehicle identification number (VIN).</p>
     * <blockquote>
     * <ul>
     * <li>If ParamType is set to normal, enter the plaintext value.</li>
     * <li>If ParamType is set to md5, enter the plaintext of the VIN excluding the last 4 characters, concatenated with the MD5-encrypted value of the last 4 characters (32-bit lowercase MD5).</li>
     * </ul>
     * </blockquote>
     * 
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
