// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <p>Note: Only the numbers of second-generation resident identity cards and residence permits for Hong Kong, Macao, and Taiwan residents are supported.</p>
     * <ul>
     * <li><p>If you set paramType to normal, enter the ID card number in plaintext.</p>
     * </li>
     * <li><p>If you set paramType to md5, enter the first 6 digits of the ID card number in plaintext, the date of birth in ciphertext, and the last 4 digits of the ID card number in plaintext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: 429001********8211</p>
     * <p>Ciphertext:</p>
     * <p>42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li><p>normal: plaintext without encryption</p>
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
     * <p>The name.</p>
     * <ul>
     * <li><p>If you set paramType to normal, enter the name in plaintext.</p>
     * </li>
     * <li><p>If you set paramType to md5, enter the first character of the name in ciphertext and the rest of the name in plaintext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Plaintext: Zhang San</p>
     * <p>Ciphertext:</p>
     * <p>6499fc7409049355527ef6a2ba5706b8San</p>
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
