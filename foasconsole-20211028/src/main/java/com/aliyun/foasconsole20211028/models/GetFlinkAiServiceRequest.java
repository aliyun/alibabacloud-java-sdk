// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class GetFlinkAiServiceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    public static GetFlinkAiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlinkAiServiceRequest self = new GetFlinkAiServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetFlinkAiServiceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
