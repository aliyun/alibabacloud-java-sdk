// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPConfigRequest extends TeaModel {
    /**
     * <p>The IP address or CIDR block to query. Separate multiple values with commas (,). You can specify up to 50 IP addresses or CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
     */
    @NameInMap("IPList")
    public String IPList;

    public static DescribeCdnFullDomainsBlockIPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPConfigRequest self = new DescribeCdnFullDomainsBlockIPConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPConfigRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

}
