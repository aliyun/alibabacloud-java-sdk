// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ev-cq31c7tlhtgm9nrrlj4g</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListLivyComputeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeRequest self = new ListLivyComputeRequest();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListLivyComputeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
