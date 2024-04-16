// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetJobRunRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static GetJobRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobRunRequest self = new GetJobRunRequest();
        return TeaModel.build(map, self);
    }

    public GetJobRunRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
