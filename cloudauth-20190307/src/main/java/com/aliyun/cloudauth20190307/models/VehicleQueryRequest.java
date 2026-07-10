// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleQueryRequest extends TeaModel {
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
     * <li>If ParamType is set to normal, enter the plaintext license plate number.</li>
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
     * <p>The vehicle type.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    public static VehicleQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        VehicleQueryRequest self = new VehicleQueryRequest();
        return TeaModel.build(map, self);
    }

    public VehicleQueryRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public VehicleQueryRequest setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleQueryRequest setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

}
