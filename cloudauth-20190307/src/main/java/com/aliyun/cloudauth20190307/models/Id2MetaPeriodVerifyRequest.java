// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyRequest extends TeaModel {
    /**
     * <p>ID number:</p>
     * <ul>
     * <li>When <code>paramType</code> is <code>normal</code>: Enter the plain text of the ID number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>:
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
     * <li>normal: Unencrypted.</li>
     * <li>md5: MD5 encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Name.</p>
     * <ul>
     * <li>When <code>paramType</code> = <code>normal</code>: Enter the plain text of the name.</li>
     * <li>When <code>paramType</code> = <code>md5</code>: The first character of the name MD5 encrypted (32 lowercase MD5) + the rest of the name in plain text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>End date of ID validity, format: YYYYMMDD</p>
     * 
     * <strong>example:</strong>
     * <p>20301001</p>
     */
    @NameInMap("ValidityEndDate")
    public String validityEndDate;

    /**
     * <p>Start date of ID validity, format: YYYYMMDD</p>
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
