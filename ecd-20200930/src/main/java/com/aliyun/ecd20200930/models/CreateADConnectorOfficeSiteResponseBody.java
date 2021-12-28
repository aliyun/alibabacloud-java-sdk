// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteResponseBody extends TeaModel {
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateADConnectorOfficeSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorOfficeSiteResponseBody self = new CreateADConnectorOfficeSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorOfficeSiteResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateADConnectorOfficeSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
