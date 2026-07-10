// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2Request extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <p>This parameter is required when VerifyMetaType is set to VEHICLE_3_META.</p>
     * <blockquote>
     * <ul>
     * <li>If ParamType is set to normal, enter the plaintext value.</li>
     * <li>If ParamType is set to md5, enter the first 6 digits of the ID card number in plaintext + the MD5-encrypted date of birth (32-bit lowercase MD5) + the last 4 digits of the ID card number.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li>normal: not encrypted.</li>
     * <li>md5: MD5-encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The name.</p>
     * <blockquote>
     * <ul>
     * <li>If ParamType is set to normal, enter the plaintext value.</li>
     * <li>If ParamType is set to md5, enter the MD5-encrypted first character of the name (32-bit lowercase MD5) + the remaining characters of the name in plaintext.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The license plate number.</p>
     * <blockquote>
     * <ul>
     * <li>If ParamType is set to normal, enter the plaintext value.</li>
     * <li>If ParamType is set to md5, enter the license plate number excluding the last two characters in plaintext + the MD5-encrypted last two characters (32-bit lowercase MD5).</li>
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

    /**
     * <p>The verification type.</p>
     * <blockquote>
     * <ul>
     * <li>VEHICLE_2_META: two-element verification. Verifies the name and license plate number.</li>
     * <li>VEHICLE_3_META: three-element verification. Verifies the name, license plate number, and ID card number.</li>
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
