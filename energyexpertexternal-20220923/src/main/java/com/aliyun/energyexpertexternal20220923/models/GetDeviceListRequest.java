// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceListRequest extends TeaModel {
    /**
     * <p>The ID of the site.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("factoryId")
    public String factoryId;

    public static GetDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceListRequest self = new GetDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceListRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

}
