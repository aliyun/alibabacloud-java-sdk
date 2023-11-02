// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class CloseDeliveryRequest extends TeaModel {
    @NameInMap("LogCode")
    public String logCode;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RegionId")
    public String regionId;

    public static CloseDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDeliveryRequest self = new CloseDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CloseDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public CloseDeliveryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CloseDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
