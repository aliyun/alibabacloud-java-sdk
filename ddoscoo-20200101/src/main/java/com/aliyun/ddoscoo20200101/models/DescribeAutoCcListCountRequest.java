// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueryType")
    public String queryType;

    public static DescribeAutoCcListCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcListCountRequest self = new DescribeAutoCcListCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcListCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAutoCcListCountRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
