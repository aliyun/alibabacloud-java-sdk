// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightSegmentAvailableCertRequest extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("language")
    public String language;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static IntlFlightSegmentAvailableCertRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightSegmentAvailableCertRequest self = new IntlFlightSegmentAvailableCertRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightSegmentAvailableCertRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightSegmentAvailableCertRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightSegmentAvailableCertRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IntlFlightSegmentAvailableCertRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
