// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeAllEndPointRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAllEndPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEndPointRequest self = new DescribeAllEndPointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllEndPointRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
