// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceRegistrationRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Service registration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sr-1b4aabc1c9eb4109****</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    public static GetServiceRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrationRequest self = new GetServiceRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceRegistrationRequest setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

}
