// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardDayUsagesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LatestMonthNum")
    public Integer latestMonthNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ListCardDayUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCardDayUsagesRequest self = new ListCardDayUsagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCardDayUsagesRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public ListCardDayUsagesRequest setLatestMonthNum(Integer latestMonthNum) {
        this.latestMonthNum = latestMonthNum;
        return this;
    }
    public Integer getLatestMonthNum() {
        return this.latestMonthNum;
    }

    public ListCardDayUsagesRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
