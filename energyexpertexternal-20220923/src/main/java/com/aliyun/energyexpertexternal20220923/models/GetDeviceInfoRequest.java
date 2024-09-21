// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceInfoRequest extends TeaModel {
    /**
     * <p>The ID of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pn_69873</p>
     */
    @NameInMap("deviceId")
    public String deviceId;

    /**
     * <p>The time string in the YYYY-mm-dd format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-26</p>
     */
    @NameInMap("ds")
    public String ds;

    /**
     * <p>The ID of the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pn_95</p>
     */
    @NameInMap("factoryId")
    public String factoryId;

    public static GetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoRequest self = new GetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceInfoRequest setDs(String ds) {
        this.ds = ds;
        return this;
    }
    public String getDs() {
        return this.ds;
    }

    public GetDeviceInfoRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

}
