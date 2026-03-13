// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InstanceLifecycleConfig extends TeaModel {
    /**
     * <p>The configurations of the Initializer hook.</p>
     */
    @NameInMap("initializer")
    public LifecycleHook initializer;

    /**
     * <p>The configurations of the PreStop hook.</p>
     */
    @NameInMap("preStop")
    public LifecycleHook preStop;

    public static InstanceLifecycleConfig build(java.util.Map<String, ?> map) throws Exception {
        InstanceLifecycleConfig self = new InstanceLifecycleConfig();
        return TeaModel.build(map, self);
    }

    public InstanceLifecycleConfig setInitializer(LifecycleHook initializer) {
        this.initializer = initializer;
        return this;
    }
    public LifecycleHook getInitializer() {
        return this.initializer;
    }

    public InstanceLifecycleConfig setPreStop(LifecycleHook preStop) {
        this.preStop = preStop;
        return this;
    }
    public LifecycleHook getPreStop() {
        return this.preStop;
    }

}
