// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CCTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer7CCTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CCTemplateResponseBody self = new ConfigLayer7CCTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CCTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
