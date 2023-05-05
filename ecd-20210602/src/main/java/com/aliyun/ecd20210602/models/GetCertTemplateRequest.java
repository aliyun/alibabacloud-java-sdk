// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetCertTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetCertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertTemplateRequest self = new GetCertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetCertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
