// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupOperateRequest extends TeaModel {
    /**
     * <p>The call ID. Obtain this ID from the response of the <a href="https://help.aliyun.com/document_detail/2862828.html">LlmSmartCall</a> or <a href="https://help.aliyun.com/document_detail/2881065.html">LlmSmartCallEncrypt</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14777672<strong><strong>^13452272</strong></strong></p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Specifies whether to hang up the call immediately. Valid values:</p>
     * <ul>
     * <li><p>true (default): Hangs up the call immediately.</p>
     * </li>
     * <li><p>false: Hangs up the call after the current playback finishes.</p>
     * </li>
     * </ul>
     * 
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
