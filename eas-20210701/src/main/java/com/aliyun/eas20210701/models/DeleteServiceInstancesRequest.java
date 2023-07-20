// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    @NameInMap("Container")
    public String container;

    @NameInMap("InstanceList")
    public String instanceList;

    @NameInMap("SoftRestart")
    public Boolean softRestart;

    public static DeleteServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesRequest self = new DeleteServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesRequest setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public DeleteServiceInstancesRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

    public DeleteServiceInstancesRequest setSoftRestart(Boolean softRestart) {
        this.softRestart = softRestart;
        return this;
    }
    public Boolean getSoftRestart() {
        return this.softRestart;
    }

}
