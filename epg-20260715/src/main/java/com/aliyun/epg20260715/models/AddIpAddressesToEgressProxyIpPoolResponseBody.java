// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AddIpAddressesToEgressProxyIpPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpAddressesToEgressProxyIpPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpAddressesToEgressProxyIpPoolResponseBody self = new AddIpAddressesToEgressProxyIpPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpAddressesToEgressProxyIpPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
