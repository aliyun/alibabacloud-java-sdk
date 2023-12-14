// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    @NameInMap("JsonParam")
    public String jsonParam;

    @NameInMap("RegionId")
    public String regionId;

    public static SubmitJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsRequest self = new SubmitJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobsRequest setJsonParam(String jsonParam) {
        this.jsonParam = jsonParam;
        return this;
    }
    public String getJsonParam() {
        return this.jsonParam;
    }

    public SubmitJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
