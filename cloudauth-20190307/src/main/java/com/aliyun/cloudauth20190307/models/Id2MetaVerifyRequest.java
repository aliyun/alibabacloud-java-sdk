// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <p>Note
     * Only second-generation resident ID card numbers and Hong Kong, Macao, and Taiwan residence permit numbers are supported.</p>
     * <ul>
     * <li><p>If ParamType is set to normal, enter the ID card number in plaintext.</p>
     * </li>
     * <li><p>If ParamType is set to md5, the format is: first 6 digits of the ID card number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID card number (plaintext).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：429001********8211</p>
     * <p>密文：</p>
     * <p>42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

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
     * <li><p>If ParamType is set to normal, enter the name in plaintext.</p>
     * </li>
     * <li><p>If ParamType is set to md5, the format is: first character of the name (ciphertext) + remaining characters of the name (plaintext).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>明文：张三</p>
     * <p>密文：</p>
     * <p>6499fc7409049355527ef6a2ba5706b8三​</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Id2MetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyRequest self = new Id2MetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id2MetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id2MetaVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
