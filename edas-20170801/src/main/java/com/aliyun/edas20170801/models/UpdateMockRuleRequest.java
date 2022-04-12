// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateMockRuleRequest extends TeaModel {
    @NameInMap("DubboMockItemJson")
    public String dubboMockItemJson;

    @NameInMap("ExtraJson")
    public String extraJson;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    @NameInMap("ScMockItemJson")
    public String scMockItemJson;

    public static UpdateMockRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMockRuleRequest self = new UpdateMockRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMockRuleRequest setDubboMockItemJson(String dubboMockItemJson) {
        this.dubboMockItemJson = dubboMockItemJson;
        return this;
    }
    public String getDubboMockItemJson() {
        return this.dubboMockItemJson;
    }

    public UpdateMockRuleRequest setExtraJson(String extraJson) {
        this.extraJson = extraJson;
        return this;
    }
    public String getExtraJson() {
        return this.extraJson;
    }

    public UpdateMockRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMockRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMockRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMockRuleRequest setScMockItemJson(String scMockItemJson) {
        this.scMockItemJson = scMockItemJson;
        return this;
    }
    public String getScMockItemJson() {
        return this.scMockItemJson;
    }

}
