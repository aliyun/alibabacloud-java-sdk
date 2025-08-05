// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpInfoRequest extends TeaModel {
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    public static GetDedicatedIpWarmUpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpInfoRequest self = new GetDedicatedIpWarmUpInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpInfoRequest setDedicatedIp(String dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

}
