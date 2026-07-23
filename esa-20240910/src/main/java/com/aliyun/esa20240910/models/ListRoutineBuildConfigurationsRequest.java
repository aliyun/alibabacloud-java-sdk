// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildConfigurationsRequest extends TeaModel {
    /**
     * <p>The list of ER routine names, separated by commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rwa-test,demo</p>
     */
    @NameInMap("RoutineNames")
    public String routineNames;

    public static ListRoutineBuildConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildConfigurationsRequest self = new ListRoutineBuildConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildConfigurationsRequest setRoutineNames(String routineNames) {
        this.routineNames = routineNames;
        return this;
    }
    public String getRoutineNames() {
        return this.routineNames;
    }

}
