// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckAliyunInstanceStatusSaleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public String projectId;

    public static CheckAliyunInstanceStatusSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAliyunInstanceStatusSaleRequest self = new CheckAliyunInstanceStatusSaleRequest();
        return TeaModel.build(map, self);
    }

    public CheckAliyunInstanceStatusSaleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckAliyunInstanceStatusSaleRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
