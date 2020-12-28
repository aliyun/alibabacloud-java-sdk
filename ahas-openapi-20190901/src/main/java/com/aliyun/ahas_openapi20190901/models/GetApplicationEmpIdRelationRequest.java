// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetApplicationEmpIdRelationRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static GetApplicationEmpIdRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationEmpIdRelationRequest self = new GetApplicationEmpIdRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationEmpIdRelationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetApplicationEmpIdRelationRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
