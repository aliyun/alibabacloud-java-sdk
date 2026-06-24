// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RecommendTemplatesRequest extends TeaModel {
    /**
     * <p>The scenario-specific templatetype used by the cluster. Valid values:</p>
     * <ul>
     * <li>general: general-purpose scenario</li>
     * <li>analysisVisualization: data analytics scenario</li>
     * <li>dbAcceleration: database acceleration scenario</li>
     * <li>search: search scenario</li>
     * <li>log: log scenario</li>
     * </ul>
     * <blockquote>
     * <p>Commercial model instances support the general-purpose, data analytics, database acceleration, and search scenarios. Advanced Edition instances support only the log scenario.</p>
     * </blockquote>
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
