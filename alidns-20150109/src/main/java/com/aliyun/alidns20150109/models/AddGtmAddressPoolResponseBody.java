// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    public static AddGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolResponseBody self = new AddGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGtmAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddGtmAddressPoolResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
