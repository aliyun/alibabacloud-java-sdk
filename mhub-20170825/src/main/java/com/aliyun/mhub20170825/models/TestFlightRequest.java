// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class TestFlightRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public Long appKey;

    @NameInMap("Mode")
    @Validation(required = true)
    public String mode;

    @NameInMap("DeviceToken")
    @Validation(required = true)
    public String deviceToken;

    @NameInMap("BundleId")
    @Validation(required = true)
    public String bundleId;

    @NameInMap("EncodedCert")
    public String encodedCert;

    @NameInMap("Password")
    public String password;

    public static TestFlightRequest build(java.util.Map<String, ?> map) throws Exception {
        TestFlightRequest self = new TestFlightRequest();
        return TeaModel.build(map, self);
    }

    public TestFlightRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public TestFlightRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public TestFlightRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public TestFlightRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public TestFlightRequest setEncodedCert(String encodedCert) {
        this.encodedCert = encodedCert;
        return this;
    }
    public String getEncodedCert() {
        return this.encodedCert;
    }

    public TestFlightRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
