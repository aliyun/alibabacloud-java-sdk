// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedZonesRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static DescribeSupportedZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedZonesRequest self = new DescribeSupportedZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedZonesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
