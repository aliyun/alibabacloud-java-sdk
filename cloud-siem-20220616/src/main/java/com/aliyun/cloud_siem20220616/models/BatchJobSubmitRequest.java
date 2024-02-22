// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobSubmitRequest extends TeaModel {
    /**
     * <p>The detail config of task.</p>
     */
    @NameInMap("JsonConfig")
    public String jsonConfig;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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
