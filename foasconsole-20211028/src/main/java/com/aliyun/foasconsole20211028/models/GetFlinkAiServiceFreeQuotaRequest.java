// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceFreeQuotaRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    public static GetFlinkAiServiceFreeQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceFreeQuotaRequest self = new GetFlinkAiServiceFreeQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceFreeQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
