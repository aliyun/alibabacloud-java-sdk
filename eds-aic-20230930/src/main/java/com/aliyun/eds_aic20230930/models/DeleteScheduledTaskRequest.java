// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteScheduledTaskRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-260705-agbx1eev</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    public static DeleteScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledTaskRequest self = new DeleteScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledTaskRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

}
