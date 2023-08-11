// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaItemDetailRequest extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("ota_item_id")
    public String otaItemId;

    public static FlightOtaItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaItemDetailRequest self = new FlightOtaItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public FlightOtaItemDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightOtaItemDetailRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

}
