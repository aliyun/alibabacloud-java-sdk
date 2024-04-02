// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageLibRequest extends TeaModel {
    @NameInMap("ServiceModule")
    public String serviceModule;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLibRequest self = new DescribeImageLibRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageLibRequest setServiceModule(String serviceModule) {
        this.serviceModule = serviceModule;
        return this;
    }
    public String getServiceModule() {
        return this.serviceModule;
    }

    public DescribeImageLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
