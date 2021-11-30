// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    // 删除的实例列表，多个实例名字之间逗号隔开
    @NameInMap("InstanceList")
    public String instanceList;

    public static DeleteServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesRequest self = new DeleteServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

}
