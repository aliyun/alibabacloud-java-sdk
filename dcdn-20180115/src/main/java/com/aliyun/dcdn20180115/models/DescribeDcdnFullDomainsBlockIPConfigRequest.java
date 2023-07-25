// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPConfigRequest extends TeaModel {
    /**
     * <p>The IP address or CIDR block to query. Separate multiple values with commas (,). You can specify up to 50 IP addresses or CIDR blocks.</p>
     */
    @NameInMap("IPList")
    public String IPList;

    public static DescribeDcdnFullDomainsBlockIPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnFullDomainsBlockIPConfigRequest self = new DescribeDcdnFullDomainsBlockIPConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnFullDomainsBlockIPConfigRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

}
