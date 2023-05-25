// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTrendRequest extends TeaModel {
    @NameInMap("End")
    public String end;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Region")
    public String region;

    @NameInMap("Start")
    public String start;

    @NameInMap("TagNames")
    public String tagNames;

    public static GetQueryOptimizeDataTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTrendRequest self = new GetQueryOptimizeDataTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetQueryOptimizeDataTrendRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataTrendRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataTrendRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeDataTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public GetQueryOptimizeDataTrendRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

}
