// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserApplicationsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    public static GetUserApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationsRequest self = new GetUserApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetUserApplicationsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
