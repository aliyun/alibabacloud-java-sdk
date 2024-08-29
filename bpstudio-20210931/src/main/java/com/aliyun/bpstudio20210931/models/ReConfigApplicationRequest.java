// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ReConfigApplicationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q2P4O9YSOKCT35L9</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;${instance_type}&quot;:&quot;ecs.c6.3xlarge&quot;}</p>
     */
    @NameInMap("Variables")
    public String variables;

    public static ReConfigApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReConfigApplicationRequest self = new ReConfigApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ReConfigApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReConfigApplicationRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
