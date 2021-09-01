// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class VerifyDeviceRequest extends TeaModel {
    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("CityCode")
    public String cityCode;

    public static VerifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceRequest self = new VerifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public VerifyDeviceRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

}
