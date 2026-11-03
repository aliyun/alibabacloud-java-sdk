// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleStandardVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li>If paramType is set to normal, specify the plaintext ID card number.</li>
     * <li>If paramType is set to md5, specify the ciphertext ID card number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li>If paramType is set to normal, specify the plaintext mobile phone number.</li>
     * <li>If paramType is set to md5, specify the ciphertext mobile phone number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>130********</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li>normal: No encryption.</li>
     * <li>md5: MD5 encryption.</li>
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
     * <li>If paramType is set to normal, specify the plaintext name.</li>
     * <li>If paramType is set to md5, specify the ciphertext name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Zhang*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaSimpleStandardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleStandardVerifyRequest self = new Mobile3MetaSimpleStandardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleStandardVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaSimpleStandardVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaSimpleStandardVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaSimpleStandardVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
