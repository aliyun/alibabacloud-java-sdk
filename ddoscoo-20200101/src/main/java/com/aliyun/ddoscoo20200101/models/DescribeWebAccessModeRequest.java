// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for a domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static DescribeWebAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeRequest self = new DescribeWebAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
