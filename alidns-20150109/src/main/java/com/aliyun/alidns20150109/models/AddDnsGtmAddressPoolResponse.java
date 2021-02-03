// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    public static AddDnsGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAddressPoolResponse self = new AddDnsGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnsGtmAddressPoolResponse setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddDnsGtmAddressPoolResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
