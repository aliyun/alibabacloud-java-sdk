// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesRequest extends TeaModel {
    /**
     * <p>*</p>
     * <p>*</p>
     * <p>*</p>
     * <p>*</p>
     * <p>*</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("usageScenario")
    public String usageScenario;

    public static RecommendTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        RecommendTemplatesRequest self = new RecommendTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public RecommendTemplatesRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
