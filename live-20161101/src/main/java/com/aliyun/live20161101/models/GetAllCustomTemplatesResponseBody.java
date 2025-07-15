// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetAllCustomTemplatesResponseBody extends TeaModel {
    /**
     * <p>The template names and template configurations returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;templateConfig&quot;: &quot;{\&quot;cdesc\&quot;:\&quot;H264\&quot;,\&quot;scale\&quot;:\&quot;[3:4]\&quot;,\&quot;gop\&quot;:\&quot;1\&quot;,\&quot;bframes\&quot;:\&quot;1\&quot;,\&quot;height\&quot;:\&quot;1080\&quot;}&quot;,&quot;templateName&quot;: &quot;custom1&quot;},{&quot;templateConfig&quot;: &quot;{\&quot;ar\&quot;:\&quot;44100\&quot;,\&quot;cdesc\&quot;:\&quot;H264\&quot;,\&quot;scale\&quot;:\&quot;[3:4]\&quot;,\&quot;gop\&quot;:\&quot;1\&quot;,\&quot;bframes\&quot;:\&quot;1\&quot;,\&quot;height\&quot;:\&quot;1080\&quot;}&quot;,&quot;templateName&quot;: &quot;cus&quot;}]</p>
     */
    @NameInMap("CustomTemplates")
    public String customTemplates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4791648Q-813C-6254-865C-0ED913661230</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAllCustomTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllCustomTemplatesResponseBody self = new GetAllCustomTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllCustomTemplatesResponseBody setCustomTemplates(String customTemplates) {
        this.customTemplates = customTemplates;
        return this;
    }
    public String getCustomTemplates() {
        return this.customTemplates;
    }

    public GetAllCustomTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
