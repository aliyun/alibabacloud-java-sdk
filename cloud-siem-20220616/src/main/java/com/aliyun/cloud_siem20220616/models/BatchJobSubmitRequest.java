// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobSubmitRequest extends TeaModel {
    @NameInMap("JsonConfig")
    public String jsonConfig;

    @NameInMap("RegionId")
    public String regionId;

    public static BatchJobSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchJobSubmitRequest self = new BatchJobSubmitRequest();
        return TeaModel.build(map, self);
    }

    public BatchJobSubmitRequest setJsonConfig(String jsonConfig) {
        this.jsonConfig = jsonConfig;
        return this;
    }
    public String getJsonConfig() {
        return this.jsonConfig;
    }

    public BatchJobSubmitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
