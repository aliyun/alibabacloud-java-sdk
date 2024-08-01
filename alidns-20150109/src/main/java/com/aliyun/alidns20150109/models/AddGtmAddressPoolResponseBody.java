// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the address pool created.</p>
     * 
     * <strong>example:</strong>
     * <p>hraf3x</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>hraf14</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolResponseBody self = new AddGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
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

    public AddGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
