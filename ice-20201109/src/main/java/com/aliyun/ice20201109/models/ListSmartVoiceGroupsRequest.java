// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartVoiceGroupsRequest extends TeaModel {
    /**
     * <p>The voice type. If you do not specify this parameter, the operation returns voices from the small model by default. Set this parameter to <code>CosyVoice</code> to retrieve voices from the Cosyvoice large model.</p>
     * 
     * <strong>example:</strong>
     * <p>CosyVoice</p>
     */
    @NameInMap("VoiceType")
    public String voiceType;

    public static ListSmartVoiceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmartVoiceGroupsRequest self = new ListSmartVoiceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSmartVoiceGroupsRequest setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

}
