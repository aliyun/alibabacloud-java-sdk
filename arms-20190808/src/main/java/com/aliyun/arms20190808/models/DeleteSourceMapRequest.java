// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapRequest extends TeaModel {
    @NameInMap("FidList")
    public java.util.List<String> fidList;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSourceMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceMapRequest self = new DeleteSourceMapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceMapRequest setFidList(java.util.List<String> fidList) {
        this.fidList = fidList;
        return this;
    }
    public java.util.List<String> getFidList() {
        return this.fidList;
    }

    public DeleteSourceMapRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteSourceMapRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
