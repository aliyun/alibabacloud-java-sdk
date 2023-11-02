// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class OpenDeliveryRequest extends TeaModel {
    @NameInMap("LogCode")
    public String logCode;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RegionId")
    public String regionId;

    public static OpenDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDeliveryRequest self = new OpenDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public OpenDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public OpenDeliveryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public OpenDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
