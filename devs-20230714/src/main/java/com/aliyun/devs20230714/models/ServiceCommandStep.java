// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceCommandStep extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>./</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>s invoke</p>
     */
    @NameInMap("run")
    public String run;

    public static ServiceCommandStep build(java.util.Map<String, ?> map) throws Exception {
        ServiceCommandStep self = new ServiceCommandStep();
        return TeaModel.build(map, self);
    }

    public ServiceCommandStep setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ServiceCommandStep setRun(String run) {
        this.run = run;
        return this;
    }
    public String getRun() {
        return this.run;
    }

}
