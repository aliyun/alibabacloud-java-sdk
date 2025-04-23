// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AcceptDataworksEventRequest extends TeaModel {
    /**
     * <p>The event content in the message.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;eventCode&quot;:&quot;d<em><em><strong>ct&quot;,&quot;projectId&quot;:&quot;8</strong></em>6&quot;,&quot;tenantId&quot;:4</em>*<em><strong><strong>8,&quot;operator&quot;:&quot;115</strong></strong></em>901&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The message ID. You can obtain the ID from the message received when an extension point event is triggered. For more information about the message format, see <a href="https://help.aliyun.com/document_detail/436911.html">Message formats</a>.</p>
     * 
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
