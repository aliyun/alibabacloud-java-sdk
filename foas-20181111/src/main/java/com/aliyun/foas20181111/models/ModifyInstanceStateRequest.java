// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyInstanceStateRequest extends TeaModel {
    @NameInMap("expectState")
    public String expectState;

    @NameInMap("isFlush")
    public Boolean isFlush;

    @NameInMap("triggerCheckpoint")
    public Boolean triggerCheckpoint;

    public static ModifyInstanceStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStateRequest self = new ModifyInstanceStateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStateRequest setExpectState(String expectState) {
        this.expectState = expectState;
        return this;
    }
    public String getExpectState() {
        return this.expectState;
    }

    public ModifyInstanceStateRequest setIsFlush(Boolean isFlush) {
        this.isFlush = isFlush;
        return this;
    }
    public Boolean getIsFlush() {
        return this.isFlush;
    }

    public ModifyInstanceStateRequest setTriggerCheckpoint(Boolean triggerCheckpoint) {
        this.triggerCheckpoint = triggerCheckpoint;
        return this;
    }
    public Boolean getTriggerCheckpoint() {
        return this.triggerCheckpoint;
    }

}
