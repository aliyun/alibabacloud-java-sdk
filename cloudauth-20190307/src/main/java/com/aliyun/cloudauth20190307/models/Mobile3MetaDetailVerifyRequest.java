// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <blockquote>
     * <p>Note: Only second-generation resident ID card numbers and Hong Kong, Macao, or Taiwan residence permit numbers are supported.</p>
     * </blockquote>
     * <ul>
     * <li><p>If ParamType is set to normal, pass in the ID card number in plaintext.</p>
     * </li>
     * <li><p>If ParamType is set to md5, pass in the ID card number in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：429001********8211</p>
     * <p>密文：</p>
     * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The phone number.</p>
     * <ul>
     * <li><p>If ParamType is set to normal, pass in the phone number in plaintext.</p>
     * </li>
     * <li><p>If ParamType is set to md5, pass in the phone number in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：186****2055</p>
     * <p>密文：</p>
     * <p>849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p>normal: plaintext without encryption</p>
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
     * <li><p>If ParamType is set to normal, pass in the name in plaintext.</p>
     * </li>
     * <li><p>If ParamType is set to md5, pass in the name in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：张三</p>
     * <p>密文：</p>
     * <p>32fa7bcd874161bea8ec8fd98f390ec9</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaDetailVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailVerifyRequest self = new Mobile3MetaDetailVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaDetailVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaDetailVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaDetailVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
