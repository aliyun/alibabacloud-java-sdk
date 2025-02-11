// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupOperateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>147776727911^134522727911</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ImmediateHangup")
    public Boolean immediateHangup;

    public static HangupOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        HangupOperateRequest self = new HangupOperateRequest();
        return TeaModel.build(map, self);
    }

    public HangupOperateRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public HangupOperateRequest setImmediateHangup(Boolean immediateHangup) {
        this.immediateHangup = immediateHangup;
        return this;
    }
    public Boolean getImmediateHangup() {
        return this.immediateHangup;
    }

}
