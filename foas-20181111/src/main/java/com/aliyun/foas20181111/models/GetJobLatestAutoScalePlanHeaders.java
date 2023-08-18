// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetJobLatestAutoScalePlanHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("RegionId")
    public String regionId;

    public static GetJobLatestAutoScalePlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetJobLatestAutoScalePlanHeaders self = new GetJobLatestAutoScalePlanHeaders();
        return TeaModel.build(map, self);
    }

    public GetJobLatestAutoScalePlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetJobLatestAutoScalePlanHeaders setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
