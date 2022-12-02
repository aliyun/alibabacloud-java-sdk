// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static CreateSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSetupProjectResponseBody self = new CreateSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSetupProjectResponseBody setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}
