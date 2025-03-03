// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AcceptDataworksEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;eventCode&quot;:&quot;d<em><em><strong>ct&quot;,&quot;projectId&quot;:&quot;8</strong></em>6&quot;,&quot;tenantId&quot;:4</em>*<em><strong><strong>8,&quot;operator&quot;:&quot;115</strong></strong></em>901&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>539306ba-*****-41a0-****-6dc81060985c</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static AcceptDataworksEventRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptDataworksEventRequest self = new AcceptDataworksEventRequest();
        return TeaModel.build(map, self);
    }

    public AcceptDataworksEventRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public AcceptDataworksEventRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
