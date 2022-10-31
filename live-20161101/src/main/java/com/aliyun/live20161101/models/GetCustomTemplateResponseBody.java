// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponseBody extends TeaModel {
    @NameInMap("CustomTemplate")
    public String customTemplate;

    @NameInMap("RequestId")
    public String requestId;

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
