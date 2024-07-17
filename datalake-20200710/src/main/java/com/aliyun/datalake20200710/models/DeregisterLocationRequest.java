// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeregisterLocationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LOC-AB8FBC17F95A4AF5</p>
     */
    @NameInMap("LocationId")
    public String locationId;

    public static DeregisterLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterLocationRequest self = new DeregisterLocationRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterLocationRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

}
