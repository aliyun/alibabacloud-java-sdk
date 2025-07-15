// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponseBody extends TeaModel {
    /**
     * <p>The configurations of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{height:1080,scale:[16:9],gop:60,bframes:30,cdesc:h264}</p>
     */
    @NameInMap("CustomTemplate")
    public String customTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC1E78D3-FA8B-4457-DEE2-6093E1232254</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTemplate</p>
     */
    @NameInMap("Template")
    public String template;

    public static GetCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTemplateResponseBody self = new GetCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomTemplateResponseBody setCustomTemplate(String customTemplate) {
        this.customTemplate = customTemplate;
        return this;
    }
    public String getCustomTemplate() {
        return this.customTemplate;
    }

    public GetCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomTemplateResponseBody setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
