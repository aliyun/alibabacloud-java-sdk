// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListRouteRuleRequest extends TeaModel {
    @NameInMap("BizChainName")
    public String bizChainName;

    @NameInMap("DeviceGroupName")
    public String deviceGroupName;

    @NameInMap("Num")
    public Integer num;

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

    public ListRouteRuleRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
