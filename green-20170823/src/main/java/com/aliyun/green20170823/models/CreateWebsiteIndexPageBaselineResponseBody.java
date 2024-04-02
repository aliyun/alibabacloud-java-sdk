// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebsiteIndexPageBaselineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWebsiteIndexPageBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebsiteIndexPageBaselineResponseBody self = new CreateWebsiteIndexPageBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebsiteIndexPageBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
