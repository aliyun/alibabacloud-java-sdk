// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyRequest extends TeaModel {
    /**
     * <p>When the Test flag is false or empty, AuthYears is required, in years, with a range of [1,100]. A value of 100 indicates permanent authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthYears")
    public Integer authYears;

    /**
     * <p>Business type. No more than 64 characters. Can be used to note specific business, such as different face usage scenarios of the access party or the customer identifier to be delivered. It is recommended to pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_TEST</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Test flag. If true, it indicates using test authorization with a default duration of 30 days; if false, the authorization duration will be based on AuthYears.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Test")
    public Boolean test;

    /**
     * <p>User device ID. No more than 64 characters. Can be used to identify a specific device, and it is suggested to use the physical number of the device. It is recommended to pass this parameter.</p>
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
