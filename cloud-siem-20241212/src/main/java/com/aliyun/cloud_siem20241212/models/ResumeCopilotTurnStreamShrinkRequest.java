// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ResumeCopilotTurnStreamShrinkRequest extends TeaModel {
    /**
     * <p>The conversation ID. This parameter is required for the second and subsequent turns in a multi-turn conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The native run cursor mapping.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CursorByRun")
    public String cursorByRunShrink;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center for threat analysis is located. You need to select the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The asset belongs to the Chinese mainland and China (Hong Kong).</li>
     * <li>ap-southeast-1: The asset belongs to a region outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
     */
    @NameInMap("TurnId")
    public String turnId;

    public static ResumeCopilotTurnStreamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeCopilotTurnStreamShrinkRequest self = new ResumeCopilotTurnStreamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResumeCopilotTurnStreamShrinkRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ResumeCopilotTurnStreamShrinkRequest setCursorByRunShrink(String cursorByRunShrink) {
        this.cursorByRunShrink = cursorByRunShrink;
        return this;
    }
    public String getCursorByRunShrink() {
        return this.cursorByRunShrink;
    }

    public ResumeCopilotTurnStreamShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResumeCopilotTurnStreamShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResumeCopilotTurnStreamShrinkRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ResumeCopilotTurnStreamShrinkRequest setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

}
