// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineBuildConfigurationRequest extends TeaModel {
    /**
     * <p>The ER name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    public static GetRoutineBuildConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineBuildConfigurationRequest self = new GetRoutineBuildConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineBuildConfigurationRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

}
