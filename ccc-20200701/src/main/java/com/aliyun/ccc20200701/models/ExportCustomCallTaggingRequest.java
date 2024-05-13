// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ExportCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomCallTaggingRequest self = new ExportCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public ExportCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
