// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("usageScenario")
    public String usageScenario;

    public static RecommendTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        RecommendTemplatesRequest self = new RecommendTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public RecommendTemplatesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public RecommendTemplatesRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
