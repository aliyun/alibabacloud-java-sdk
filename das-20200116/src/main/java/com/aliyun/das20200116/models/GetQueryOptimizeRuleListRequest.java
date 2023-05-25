// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Region")
    public String region;

    @NameInMap("TagNames")
    public String tagNames;

    public static GetQueryOptimizeRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListRequest self = new GetQueryOptimizeRuleListRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeRuleListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeRuleListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeRuleListRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

}
