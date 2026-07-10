// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyRequest extends TeaModel {
    /**
     * <p>The authorization duration. This parameter is required when the Test parameter is set to false or is left empty. Unit: years. Valid values: 1 to 100. A value of 100 indicates permanent authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthYears")
    public Integer authYears;

    /**
     * <p>The business type. The value can be up to 64 characters in length. You can use this parameter to add remarks for a specific business, such as different facial recognition scenarios of the requester or the customer identifier to be delivered. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_TEST</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The test identifier. Valid values:</p>
     * <ul>
     * <li>true: Uses test authorization. The authorization duration is 30 days by default.</li>
     * <li>false: The authorization duration is determined by the AuthYears parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Test")
    public Boolean test;

    /**
     * <p>The user device ID. The value can be up to 64 characters in length. You can use this parameter to identify a specific device. We recommend that you use the physical device number. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>3iJ1AY$oHcu7mC69</p>
     */
    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static CreateAuthKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyRequest self = new CreateAuthKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyRequest setAuthYears(Integer authYears) {
        this.authYears = authYears;
        return this;
    }
    public Integer getAuthYears() {
        return this.authYears;
    }

    public CreateAuthKeyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthKeyRequest setTest(Boolean test) {
        this.test = test;
        return this;
    }
    public Boolean getTest() {
        return this.test;
    }

    public CreateAuthKeyRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
