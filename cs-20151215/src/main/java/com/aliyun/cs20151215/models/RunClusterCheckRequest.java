// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterCheckRequest extends TeaModel {
    /**
     * <p>The cluster check items.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>检查目标。</p>
     * 
     * <strong>example:</strong>
     * <p>np1f6779297c4444a3a1cdd29be8e5****</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The check method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClusterUpgrade</p>
     */
    @NameInMap("type")
    public String type;

    public static RunClusterCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterCheckRequest self = new RunClusterCheckRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterCheckRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public RunClusterCheckRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public RunClusterCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
