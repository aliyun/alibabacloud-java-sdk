// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleVerifyRequest extends TeaModel {
    /**
     * <p>ID card number:</p>
     * <p>Note
     * Only the ID numbers of the second-generation resident ID card and Hong Kong, Macao, and Taiwan residence permits are supported.</p>
     * <ul>
     * <li><p>When paramType is set to normal: pass in the ID card number in plaintext.</p>
     * </li>
     * <li><p>When paramType is set to md5: pass in the encrypted ID card number.</p>
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
     * <p>Mobile number:</p>
     * <ul>
     * <li><p>When paramType is set to normal: pass in the mobile number in plaintext.</p>
     * </li>
     * <li><p>When paramType is set to md5: pass in the encrypted mobile number.</p>
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
     * <p>Encryption method:</p>
     * <ul>
     * <li><p>normal: plaintext, no encryption</p>
     * </li>
     * <li><p>md5: MD5 encryption</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Name:</p>
     * <ul>
     * <li><p>When paramType is set to normal: pass in the name in plaintext.</p>
     * </li>
     * <li><p>When paramType is set to md5: pass in the encrypted name.</p>
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
