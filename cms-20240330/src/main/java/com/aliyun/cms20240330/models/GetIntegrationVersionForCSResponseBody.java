// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetIntegrationVersionForCSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>V1</p>
     */
    @NameInMap("integrationVersion")
    public String integrationVersion;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD9BCF34-EA09-5643-BC11-AF41C8DFAE5A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetIntegrationVersionForCSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationVersionForCSResponseBody self = new GetIntegrationVersionForCSResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationVersionForCSResponseBody setIntegrationVersion(String integrationVersion) {
        this.integrationVersion = integrationVersion;
        return this;
    }
    public String getIntegrationVersion() {
        return this.integrationVersion;
    }

    public GetIntegrationVersionForCSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
