// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineBuildConfigurationRequest extends TeaModel {
    /**
     * <p>The ER name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    public static DeleteRoutineBuildConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineBuildConfigurationRequest self = new DeleteRoutineBuildConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineBuildConfigurationRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

}
