// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleInsureQueryRequest extends TeaModel {
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
     * <li>When <code>paramType</code> is set to <code>normal</code>, enter the plain text.</li>
     * <li>When <code>paramType</code> is set to <code>md5</code>, enter the plain text of all but the last two characters of the license plate + the MD5 encryption (32 lowercase characters) of the last two characters of the license plate.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>陕A9****</p>
     */
    @NameInMap("VehicleNum")
    public String vehicleNum;

    /**
     * <p>Driver\&quot;s license vehicle type.</p>
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    /**
     * <p>Vehicle identification code, i.e., the vehicle VIN</p>
     * <blockquote>
     * <ul>
     * <li>When <code>paramType</code> is set to <code>normal</code>, enter the plain text.</li>
     * <li>When <code>paramType</code> is set to <code>md5</code>, enter the plain text of all but the last four characters of the VIN + the MD5 encryption (32 lowercase characters) of the last four characters of the VIN.</li>
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
