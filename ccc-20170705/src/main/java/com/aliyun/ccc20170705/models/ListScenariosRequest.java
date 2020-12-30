// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListScenariosRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListScenariosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenariosRequest self = new ListScenariosRequest();
        return TeaModel.build(map, self);
    }

    public ListScenariosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
