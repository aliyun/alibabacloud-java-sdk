// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmFullDuplexCallOperateRequest extends TeaModel {
    /**
     * <p>通话的唯一回执 ID。可通过 llmSmartCallFullDuplex 接口获取。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>动作指令：play / flush / hangup / sendDtmf</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>扩展参数，JSON 字符串。各 command 参数说明：</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Param")
    public String param;

    public static LlmFullDuplexCallOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmFullDuplexCallOperateRequest self = new LlmFullDuplexCallOperateRequest();
        return TeaModel.build(map, self);
    }

    public LlmFullDuplexCallOperateRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public LlmFullDuplexCallOperateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public LlmFullDuplexCallOperateRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
