// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaStandardVerifyRequest extends TeaModel {
    /**
     * <p>ID number:</p>
     * <ul>
     * <li>When <code>paramType</code> is normal: enter the plain text of the ID number.</li>
     * <li>When <code>paramType</code> is md5:
     * The first 6 digits (plain text) + date of birth (encrypted) + last 4 digits (plain text).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li>normal: unencrypted.</li>
     * <li>md5: md5 encrypted.</li>
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
     * <li>When <code>paramType</code> is normal: enter the plain text of the name.</li>
     * <li>When <code>paramType</code> is md5: the first character of the name (encrypted) + the rest of the name (plain text).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
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
