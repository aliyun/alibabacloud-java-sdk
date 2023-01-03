// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidRequest extends TeaModel {
    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    public static GetRetcodeAppByPidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeAppByPidRequest self = new GetRetcodeAppByPidRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeAppByPidRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeAppByPidRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
