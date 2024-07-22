// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesRequest extends TeaModel {
    /**
     * <ul>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * </ul>
     * <p>**</p>
     * <hr>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>general</p>
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
