// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Vehicle5ItemQueryRequest extends TeaModel {
    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li><strong>normal</strong>: Unencrypted.</li>
     * <li><strong>md5</strong>: MD5 encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>License plate number</p>
     * <blockquote>
     * <ul>
     * <li>When paramType is set to normal, enter the plain text.</li>
     * <li>When paramType is set to md5, enter the plain text of all but the last two characters of the license plate + MD5 encryption (32-bit lowercase MD5) of the last two characters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>陕A9****</p>
     */
    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <p>Vehicle type</p>
     * <blockquote>
     * <ul>
     * <li>02: Ordinary passenger car</li>
     * <li>52: New energy passenger car</li>
     * </ul>
     * </blockquote>
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
