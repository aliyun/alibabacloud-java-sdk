// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpInfoRequest extends TeaModel {
    @NameInMap("IP")
    public String IP;

    public static DescribeDcdnIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpInfoRequest self = new DescribeDcdnIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpInfoRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

}
