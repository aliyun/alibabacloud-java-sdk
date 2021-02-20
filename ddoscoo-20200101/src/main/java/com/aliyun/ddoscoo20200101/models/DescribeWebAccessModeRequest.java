// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessModeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static DescribeWebAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessModeRequest self = new DescribeWebAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWebAccessModeRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
