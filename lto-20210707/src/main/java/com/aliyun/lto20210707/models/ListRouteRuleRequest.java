// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListRouteRuleRequest extends TeaModel {
    @NameInMap("BizChainName")
    public String bizChainName;

    @NameInMap("ChainUpMode")
    public String chainUpMode;

    @NameInMap("DeviceGroupName")
    public String deviceGroupName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Num")
    public Integer num;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static ListRouteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRuleRequest self = new ListRouteRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteRuleRequest setBizChainName(String bizChainName) {
        this.bizChainName = bizChainName;
        return this;
    }
    public String getBizChainName() {
        return this.bizChainName;
    }

    public ListRouteRuleRequest setChainUpMode(String chainUpMode) {
        this.chainUpMode = chainUpMode;
        return this;
    }
    public String getChainUpMode() {
        return this.chainUpMode;
    }

    public ListRouteRuleRequest setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
        return this;
    }
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    public ListRouteRuleRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListRouteRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRouteRuleRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
