// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHttpVpcResponseBody extends TeaModel {
    @NameInMap("ServiceRpcSign")
    public String serviceRpcSign;

    @NameInMap("Params")
    public String params;

    public static FtDynamicAddressHttpVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHttpVpcResponseBody self = new FtDynamicAddressHttpVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHttpVpcResponseBody setServiceRpcSign(String serviceRpcSign) {
        this.serviceRpcSign = serviceRpcSign;
        return this;
    }
    public String getServiceRpcSign() {
        return this.serviceRpcSign;
    }

    public FtDynamicAddressHttpVpcResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
