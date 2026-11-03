// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <p>Note: Only the numbers of second-generation resident identity cards and residence permits for Hong Kong, Macao, and Taiwan residents are supported.</p>
     * <ul>
     * <li><p>If you set paramType to normal, enter the ID card number in plaintext.</p>
     * </li>
     * <li><p>If you set paramType to md5, enter the ID card number in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: 429001********8211</p>
     * <p>Ciphertext:</p>
     * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li><p>If you set paramType to normal, enter the mobile phone number in plaintext.</p>
     * </li>
     * <li><p>If you set paramType to md5, enter the mobile phone number in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: 186****2055</p>
     * <p>Ciphertext:</p>
     * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p>normal: plaintext without encryption.</p>
     * </li>
     * <li><p>md5: MD5 encryption.</p>
     * </li>
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
     * <li><p>If you set paramType to normal, enter the name in plaintext.</p>
     * </li>
     * <li><p>If you set paramType to md5, enter the name in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: Zhang San</p>
     * <p>Ciphertext:</p>
     * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaSimpleVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleVerifyRequest self = new Mobile3MetaSimpleVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaSimpleVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaSimpleVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaSimpleVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
