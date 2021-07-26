// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteResourceInformationRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例 ID。
    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    public static DeleteResourceInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInformationRequest self = new DeleteResourceInformationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteResourceInformationRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

}
