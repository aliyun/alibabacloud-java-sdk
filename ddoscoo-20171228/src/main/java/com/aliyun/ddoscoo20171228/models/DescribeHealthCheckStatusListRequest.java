// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusListRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeHealthCheckStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusListRequest self = new DescribeHealthCheckStatusListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusListRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public DescribeHealthCheckStatusListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
