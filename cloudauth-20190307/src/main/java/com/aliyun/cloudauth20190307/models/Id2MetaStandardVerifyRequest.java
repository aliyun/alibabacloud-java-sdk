// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaStandardVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li>If paramType is set to normal: enter the plaintext ID card number.</li>
     * <li>If paramType is set to md5: enter the first 6 digits of the ID card number (plaintext) + the date of birth (ciphertext) + the last 4 digits of the ID card number (plaintext).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

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
     * <li>If paramType is set to normal: enter the plaintext name.</li>
     * <li>If paramType is set to md5: enter the first character of the name (ciphertext) + the rest of the name (plaintext).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Zhang*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static Id2MetaStandardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaStandardVerifyRequest self = new Id2MetaStandardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaStandardVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id2MetaStandardVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id2MetaStandardVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
