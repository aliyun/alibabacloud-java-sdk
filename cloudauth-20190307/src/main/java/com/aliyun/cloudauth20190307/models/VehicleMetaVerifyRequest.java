// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyRequest extends TeaModel {
    /**
     * <p>ID number.</p>
     * <p>This is a required field when VerifyMetaType is set to VEHICLE_3_META.</p>
     * <blockquote>
     * <ul>
     * <li>When paramType is set to normal, enter the plain text.</li>
     * <li>When paramType is set to md5, enter the first 6 digits in plain text + the birth date encrypted with MD5 (32 lowercase characters) + the last 4 digits in plain text.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li>normal: Unencrypted.</li>
     * <li>md5: Encrypted with MD5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Name</p>
     * <blockquote>
     * <p>This is an explanation</p>
     * <ul>
     * <li>When paramType is set to normal, enter the plain text.</li>
     * <li>When paramType is set to md5, encrypt the first character of the name with MD5 (32 lowercase characters) + the rest of the name in plain text.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Vehicle license plate</p>
     * <blockquote>
     * <ul>
     * <li>When paramType is set to normal, enter the plain text.</li>
     * <li>When paramType is set to md5, enter the part of the license plate except for the last two characters in plain text + the last two characters of the license plate encrypted with MD5 (32 lowercase characters).</li>
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
     * 
     * <strong>example:</strong>
     * <p>02</p>
     */
    @NameInMap("VehicleType")
    public String vehicleType;

    /**
     * <p>Verification type</p>
     * <blockquote>
     * <ul>
     * <li>VEHICLE_2_META: Two-element verification, name + vehicle license plate verification;</li>
     * <li>VEHICLE_3_META: Three-element verification, name + vehicle license plate + ID number verification;</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VEHICLE_2_META</p>
     */
    @NameInMap("VerifyMetaType")
    public String verifyMetaType;

    public static VehicleMetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyRequest self = new VehicleMetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public VehicleMetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public VehicleMetaVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public VehicleMetaVerifyRequest setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleMetaVerifyRequest setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleMetaVerifyRequest setVerifyMetaType(String verifyMetaType) {
        this.verifyMetaType = verifyMetaType;
        return this;
    }
    public String getVerifyMetaType() {
        return this.verifyMetaType;
    }

}
