// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    // The IDs of the instance.
    @NameInMap("instanceIds")
    public java.util.List<String> instanceIds;

    // The maximum number of resources to return. Valid values: \[0,1000].
    // 
    // The number of returned resources is less than or equal to the specified number.
    @NameInMap("limit")
    public Integer limit;

    // The version or alias.
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
