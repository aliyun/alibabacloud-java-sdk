// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class OmniRealtimeConversationEURequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250211/tixcef/cherry.wav">https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250211/tixcef/cherry.wav</a></p>
     */
    @NameInMap("inputAudio")
    public String inputAudio;

    @NameInMap("userPrompt")
    public String userPrompt;

    /**
     * <strong>example:</strong>
     * <p>Cherry</p>
     */
    @NameInMap("voice")
    public String voice;

    public static OmniRealtimeConversationEURequest build(java.util.Map<String, ?> map) throws Exception {
        OmniRealtimeConversationEURequest self = new OmniRealtimeConversationEURequest();
        return TeaModel.build(map, self);
    }

    public OmniRealtimeConversationEURequest setInputAudio(String inputAudio) {
        this.inputAudio = inputAudio;
        return this;
    }
    public String getInputAudio() {
        return this.inputAudio;
    }

    public OmniRealtimeConversationEURequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public OmniRealtimeConversationEURequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

}
