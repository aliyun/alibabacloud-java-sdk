// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    /**
     * <p>The name of the container whose process needs to be restarted. This parameter takes effect only if the SoftRestart parameter is set to true.</p>
     */
    @NameInMap("Container")
    public String container;

    @NameInMap("InstanceList")
    public String instanceList;

    /**
     * <p>Specifies whether to restart only the container process without recreating the instance. Default value: false. Valid values: true and false.</p>
     */
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
