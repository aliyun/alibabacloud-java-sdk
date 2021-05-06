// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteResponse extends TeaModel {
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateADConnectorOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorOfficeSiteResponse self = new CreateADConnectorOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorOfficeSiteResponse setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateADConnectorOfficeSiteResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
