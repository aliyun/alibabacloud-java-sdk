// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsByIpRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    public static ListEndpointsByIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsByIpRequest self = new ListEndpointsByIpRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointsByIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
