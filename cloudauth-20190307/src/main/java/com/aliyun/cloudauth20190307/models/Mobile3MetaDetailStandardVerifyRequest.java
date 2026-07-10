// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailStandardVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li>If ParamType is set to normal, pass in the ID card number in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted ID card number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The phone number.</p>
     * <ul>
     * <li>If ParamType is set to normal, pass in the phone number in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted phone number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>138********</p>
     */
    @NameInMap("Mobile")
    public String mobile;

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
     * <ul>
     * <li>If ParamType is set to normal, pass in the name in plaintext.</li>
     * <li>If ParamType is set to md5, pass in the MD5-encrypted name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaDetailStandardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailStandardVerifyRequest self = new Mobile3MetaDetailStandardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailStandardVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaDetailStandardVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaDetailStandardVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaDetailStandardVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
