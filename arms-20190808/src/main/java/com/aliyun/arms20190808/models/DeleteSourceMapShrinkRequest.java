// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapShrinkRequest extends TeaModel {
    // The IDs of the SourceMap files.
    @NameInMap("FidList")
    public String fidListShrink;

    // The process identifier (PID) of the application.
    @NameInMap("Pid")
    public String pid;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteSourceMapShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceMapShrinkRequest self = new DeleteSourceMapShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceMapShrinkRequest setFidListShrink(String fidListShrink) {
        this.fidListShrink = fidListShrink;
        return this;
    }
    public String getFidListShrink() {
        return this.fidListShrink;
    }

    public DeleteSourceMapShrinkRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteSourceMapShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
