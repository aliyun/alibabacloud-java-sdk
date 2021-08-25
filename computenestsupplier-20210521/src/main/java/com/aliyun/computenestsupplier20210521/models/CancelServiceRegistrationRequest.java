// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CancelServiceRegistrationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegistrationId")
    public String registrationId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CancelServiceRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceRegistrationRequest self = new CancelServiceRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CancelServiceRegistrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelServiceRegistrationRequest setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public CancelServiceRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
