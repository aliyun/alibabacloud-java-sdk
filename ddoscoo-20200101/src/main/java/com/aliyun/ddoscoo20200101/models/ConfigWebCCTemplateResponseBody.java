// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigWebCCTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCTemplateResponseBody self = new ConfigWebCCTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
