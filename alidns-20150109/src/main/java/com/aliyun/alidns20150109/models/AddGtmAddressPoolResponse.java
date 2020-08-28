// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    public static AddGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAddressPoolResponse self = new AddGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

}
