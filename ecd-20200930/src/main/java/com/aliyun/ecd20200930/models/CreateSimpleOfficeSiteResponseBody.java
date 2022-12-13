// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteResponseBody extends TeaModel {
    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSimpleOfficeSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteResponseBody self = new CreateSimpleOfficeSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateSimpleOfficeSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
