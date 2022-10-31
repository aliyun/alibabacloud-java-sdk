// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetAllCustomTemplatesResponseBody extends TeaModel {
    @NameInMap("CustomTemplates")
    public String customTemplates;

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
