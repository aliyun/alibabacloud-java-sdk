// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2Request extends TeaModel {
    /**
     * <p>ID number.</p>
     * <p>This is a required field when VerifyMetaType is VEHICLE_3_META.</p>
     * <blockquote>
     * <ul>
     * <li>When paramType is normal, enter plain text.</li>
     * <li>When paramType is md5, enter the first 6 digits in plain text + MD5 (32 lowercase) of the birth date + the last 4 digits in plain text.</li>
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
     * <li>md5: Md5 encrypted.</li>
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
     * <ul>
     * <li>When paramType is normal, enter plain text.</li>
     * <li>When paramType is md5, enter the first character of the name as MD5 (32 lowercase) + the rest of the name in plain text.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>License plate number</p>
     * <blockquote>
     * <ul>
     * <li>When paramType is normal, enter plain text.</li>
     * <li>When paramType is md5, enter all but the last two characters in plain text + the last two characters as MD5 (32 lowercase).</li>
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
     * <li>VEHICLE_2_META: Two-element verification, name + license plate number verification;</li>
     * <li>VEHICLE_3_META: Three-element verification, name + license plate number + ID number verification;</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VEHICLE_3_META</p>
     */
    @NameInMap("VerifyMetaType")
    public String verifyMetaType;

    public static VehicleMetaVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyV2Request self = new VehicleMetaVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyV2Request setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public VehicleMetaVerifyV2Request setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public VehicleMetaVerifyV2Request setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public VehicleMetaVerifyV2Request setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    public VehicleMetaVerifyV2Request setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleMetaVerifyV2Request setVerifyMetaType(String verifyMetaType) {
        this.verifyMetaType = verifyMetaType;
        return this;
    }
    public String getVerifyMetaType() {
        return this.verifyMetaType;
    }

}
