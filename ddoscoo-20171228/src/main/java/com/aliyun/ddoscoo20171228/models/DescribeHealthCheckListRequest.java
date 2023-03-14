// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeHealthCheckListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListRequest self = new DescribeHealthCheckListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public DescribeHealthCheckListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
