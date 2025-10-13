// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class GetCoordinationTicketRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>co-ik1nu2hxg5zbu****</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <strong>example:</strong>
     * <p>eab51156-7832-4922-9623-ff905****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetCoordinationTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinationTicketRequest self = new GetCoordinationTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetCoordinationTicketRequest setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public GetCoordinationTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
