// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchDispatchGameSlotRequest extends TeaModel {
    @NameInMap("QueueUserList")
    public String queueUserList;

    public static BatchDispatchGameSlotRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDispatchGameSlotRequest self = new BatchDispatchGameSlotRequest();
        return TeaModel.build(map, self);
    }

    public BatchDispatchGameSlotRequest setQueueUserList(String queueUserList) {
        this.queueUserList = queueUserList;
        return this;
    }
    public String getQueueUserList() {
        return this.queueUserList;
    }

}
