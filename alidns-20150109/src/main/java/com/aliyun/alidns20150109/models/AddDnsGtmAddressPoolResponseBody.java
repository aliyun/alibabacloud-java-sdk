// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    public static AddDnsGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAddressPoolResponseBody self = new AddDnsGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnsGtmAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddDnsGtmAddressPoolResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
