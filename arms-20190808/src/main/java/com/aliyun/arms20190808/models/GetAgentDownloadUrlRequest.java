// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlRequest extends TeaModel {
    /**
     * <p>The download URL of the ARMS agent.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAgentDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlRequest self = new GetAgentDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
