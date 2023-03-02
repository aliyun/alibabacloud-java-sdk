// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryInstanceRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceRequest self = new QueryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
