// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardUsagesRequest extends TeaModel {
    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ListCardUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCardUsagesRequest self = new ListCardUsagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCardUsagesRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public ListCardUsagesRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
