// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendSdkStreamMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:&quot;123&quot;}</p>
     */
    @NameInMap("commonStreamMessage")
    public String commonStreamMessage;

    public static SendSdkStreamMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendSdkStreamMessageResponseBody self = new SendSdkStreamMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendSdkStreamMessageResponseBody setCommonStreamMessage(String commonStreamMessage) {
        this.commonStreamMessage = commonStreamMessage;
        return this;
    }
    public String getCommonStreamMessage() {
        return this.commonStreamMessage;
    }

}
