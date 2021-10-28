// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteQualityRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRuleRequest self = new DeleteQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteQualityRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
