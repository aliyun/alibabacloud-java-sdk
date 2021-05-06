// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    public static CreateSimpleOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteResponse self = new CreateSimpleOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSimpleOfficeSiteResponse setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

}
