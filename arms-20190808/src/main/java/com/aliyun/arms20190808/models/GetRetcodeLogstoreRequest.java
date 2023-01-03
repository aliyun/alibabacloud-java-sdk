// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeLogstoreRequest extends TeaModel {
    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    public static GetRetcodeLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeLogstoreRequest self = new GetRetcodeLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeLogstoreRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeLogstoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
