// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleMarketResponseBody extends TeaModel {
    @NameInMap("moduleMarketId")
    public String moduleMarketId;

    @NameInMap("requestId")
    public String requestId;

    public static CreateModuleMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleMarketResponseBody self = new CreateModuleMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModuleMarketResponseBody setModuleMarketId(String moduleMarketId) {
        this.moduleMarketId = moduleMarketId;
        return this;
    }
    public String getModuleMarketId() {
        return this.moduleMarketId;
    }

    public CreateModuleMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
