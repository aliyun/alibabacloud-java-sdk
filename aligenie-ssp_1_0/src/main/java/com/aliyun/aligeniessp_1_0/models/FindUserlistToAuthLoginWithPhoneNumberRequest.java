// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class FindUserlistToAuthLoginWithPhoneNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18612345678</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>+86</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static FindUserlistToAuthLoginWithPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        FindUserlistToAuthLoginWithPhoneNumberRequest self = new FindUserlistToAuthLoginWithPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public FindUserlistToAuthLoginWithPhoneNumberRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindUserlistToAuthLoginWithPhoneNumberRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public FindUserlistToAuthLoginWithPhoneNumberRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public FindUserlistToAuthLoginWithPhoneNumberRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
