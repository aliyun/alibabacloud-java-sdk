// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ER build configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3472165674357056</p>
     */
    @NameInMap("RoutineBuildConfigurationId")
    public Long routineBuildConfigurationId;

    public static CreateRoutineBuildConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildConfigurationResponseBody self = new CreateRoutineBuildConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineBuildConfigurationResponseBody setRoutineBuildConfigurationId(Long routineBuildConfigurationId) {
        this.routineBuildConfigurationId = routineBuildConfigurationId;
        return this;
    }
    public Long getRoutineBuildConfigurationId() {
        return this.routineBuildConfigurationId;
    }

}
