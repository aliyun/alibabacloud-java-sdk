// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CheckBusinessHoursRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1789526665860</p>
     */
    @NameInMap("Time")
    public Long time;

    public static CheckBusinessHoursRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBusinessHoursRequest self = new CheckBusinessHoursRequest();
        return TeaModel.build(map, self);
    }

    public CheckBusinessHoursRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckBusinessHoursRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
