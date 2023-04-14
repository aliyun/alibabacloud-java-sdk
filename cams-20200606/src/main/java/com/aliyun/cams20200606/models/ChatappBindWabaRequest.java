// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappBindWabaRequest extends TeaModel {
    /**
     * <p>The ID of the WhatsApp Business account.</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static ChatappBindWabaRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappBindWabaRequest self = new ChatappBindWabaRequest();
        return TeaModel.build(map, self);
    }

    public ChatappBindWabaRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
