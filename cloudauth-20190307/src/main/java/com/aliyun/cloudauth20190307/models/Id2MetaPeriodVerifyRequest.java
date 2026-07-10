// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the ID card number in plaintext.</li>
     * <li>If paramType is set to md5, the value is in the following format: first 6 digits of the ID card number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID card number (plaintext).</li>
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
     * <li>paramType = normal: enter the name in plaintext.</li>
     * <li>paramType = md5: the first character of the name is MD5-encrypted (32-bit lowercase MD5) + the remaining characters of the name in plaintext.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The expiration date of the ID card validity period. Format: YYYYMMDD.</p>
     * 
     * <strong>example:</strong>
     * <p>20301001</p>
     */
    @NameInMap("ValidityEndDate")
    public String validityEndDate;

    /**
     * <p>The start date of the ID card validity period. Format: YYYYMMDD.</p>
     * 
     * <strong>example:</strong>
     * <p>20201001</p>
     */
    @NameInMap("ValidityStartDate")
    public String validityStartDate;

    public static Id2MetaPeriodVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyRequest self = new Id2MetaPeriodVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id2MetaPeriodVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id2MetaPeriodVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public Id2MetaPeriodVerifyRequest setValidityEndDate(String validityEndDate) {
        this.validityEndDate = validityEndDate;
        return this;
    }
    public String getValidityEndDate() {
        return this.validityEndDate;
    }

    public Id2MetaPeriodVerifyRequest setValidityStartDate(String validityStartDate) {
        this.validityStartDate = validityStartDate;
        return this;
    }
    public String getValidityStartDate() {
        return this.validityStartDate;
    }

}
