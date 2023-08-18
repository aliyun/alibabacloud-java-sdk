// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetTaskHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("RegionId")
    public String regionId;

    public static GetTaskHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTaskHeaders self = new GetTaskHeaders();
        return TeaModel.build(map, self);
    }

    public GetTaskHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTaskHeaders setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
