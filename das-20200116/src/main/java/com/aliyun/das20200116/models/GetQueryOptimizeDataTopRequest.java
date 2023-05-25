// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTopRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Region")
    public String region;

    @NameInMap("TagNames")
    public String tagNames;

    @NameInMap("Time")
    public String time;

    @NameInMap("Type")
    public String type;

    public static GetQueryOptimizeDataTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTopRequest self = new GetQueryOptimizeDataTopRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTopRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataTopRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataTopRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeDataTopRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeDataTopRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GetQueryOptimizeDataTopRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
