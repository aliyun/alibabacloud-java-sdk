// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationPlusRequest extends TeaModel {
    /**
     * <p>The type of the moderation service.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_query_moderation</p>
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

    public static TextModerationPlusRequest build(java.util.Map<String, ?> map) throws Exception {
        TextModerationPlusRequest self = new TextModerationPlusRequest();
        return TeaModel.build(map, self);
    }

    public TextModerationPlusRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public TextModerationPlusRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
