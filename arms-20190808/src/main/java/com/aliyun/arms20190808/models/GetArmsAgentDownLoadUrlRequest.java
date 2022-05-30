// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetArmsAgentDownLoadUrlRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetArmsAgentDownLoadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArmsAgentDownLoadUrlRequest self = new GetArmsAgentDownLoadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetArmsAgentDownLoadUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
