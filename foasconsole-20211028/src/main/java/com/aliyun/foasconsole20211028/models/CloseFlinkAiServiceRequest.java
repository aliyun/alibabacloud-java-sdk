// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CloseFlinkAiServiceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    public static CloseFlinkAiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseFlinkAiServiceRequest self = new CloseFlinkAiServiceRequest();
        return TeaModel.build(map, self);
    }

    public CloseFlinkAiServiceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
