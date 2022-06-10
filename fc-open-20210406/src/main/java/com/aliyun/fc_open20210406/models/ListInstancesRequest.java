// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    // 实例ID
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    // 限定此次返回资源的数量，取值范围[0,1000]。
    // 
    // 返回结果可以小于指定的数量，但不能多于指定的数量。
    @NameInMap("limit")
    public Integer limit;

    // 服务的版本或别名。默认是LATEST。
    // 
    // 此处的qualifier同InvokeFunction的qualifier含义一致，即调用ListInstances时指定qualifier=test查询出来的实例，就是调用InvokeFunction时qualifier=test链路上的实例。
    @NameInMap("qualifier")
    public String qualifier;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListInstancesRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
