// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationRequest extends TeaModel {
    /**
     * <p>The type of the moderation service. Valid values: nickname_detection: user nickname chat_detection: chat interactions comment_detection: dynamic comments pgc_detection: professionally-generated content (PGC) teaching materials</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>pgc_detection: moderation of PGC teaching materials</li>
     * <li>nickname_detection: user nickname moderation</li>
     * <li>comment_multilingual_pro: multi-language moderation in international business scenarios</li>
     * <li>chat_detection: moderation of interactive content of private chats</li>
     * <li>ad_compliance_detection: advertising law compliance identification</li>
     * <li>comment_detection: moderation of comment content of public chats</li>
     * <li>ai_art_detection: AI-generated text identfication</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters required by the moderation service. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;Content to be moderated&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static TextModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        TextModerationRequest self = new TextModerationRequest();
        return TeaModel.build(map, self);
    }

    public TextModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public TextModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
