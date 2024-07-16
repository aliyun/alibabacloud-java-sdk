// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInformationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>cc5g-xxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static GetCreateCustomerInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInformationRequest self = new GetCreateCustomerInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCreateCustomerInformationRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
