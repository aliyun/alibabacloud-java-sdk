// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyRequest extends TeaModel {
    /**
     * <p>ID number:</p>
     * <p>Note
     * Only supports the ID numbers of second-generation resident IDs and Hong Kong, Macao, and Taiwan residence permits.</p>
     * <ul>
     * <li><p>When paramType is normal: enter the plaintext ID number.</p>
     * </li>
     * <li><p>When paramType is md5: first 6 digits of the ID number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID number (plaintext).</p>
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
     * <li><p>When paramType is normal: enter the plaintext name.</p>
     * </li>
     * <li><p>When paramType is md5: first character of the name in ciphertext + rest of the name in plaintext.</p>
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
